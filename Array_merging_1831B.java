import java.util.Scanner;

public class Array_merging_1831B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] longest_subarray_a = new int[2 * n + 1];
            int[] longest_subarray_b = new int[2 * n + 1];

            int prev_val = -1;
            int counter = 0;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == prev_val) {
                    counter++;
                } else {
                    if (prev_val != -1) {
                        longest_subarray_a[prev_val] = Math.max(longest_subarray_a[prev_val], counter);
                    }
                    prev_val = val;
                    counter = 1;
                }
            }
            if (prev_val != -1) {
                longest_subarray_a[prev_val] = Math.max(longest_subarray_a[prev_val], counter);
            }

            prev_val = -1;
            counter = 0;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == prev_val) {
                    counter++;
                } else {
                    if (prev_val != -1) {
                        longest_subarray_b[prev_val] = Math.max(longest_subarray_b[prev_val], counter);
                    }
                    prev_val = val;
                    counter = 1;
                }
            }
            if (prev_val != -1) {
                longest_subarray_b[prev_val] = Math.max(longest_subarray_b[prev_val], counter);
            }

            int max_freq = 0;
            for (int i = 1; i <= 2 * n; i++) {
                max_freq = Math.max(max_freq, longest_subarray_a[i] + longest_subarray_b[i]);
            }
            
            System.out.println(max_freq);
        }
        
        sc.close();
    }
}
