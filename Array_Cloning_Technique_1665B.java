import java.util.HashMap;
import java.util.Scanner;

public class Array_Cloning_Technique_1665B {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> mp = new HashMap<>();

            for (int i = 0; i < n; i++) {
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }

            int currentHighestFreq = 0;

            for (int freq : mp.values()) {
                currentHighestFreq = Math.max(currentHighestFreq, freq);
            }

            int operations = 0;

            while (currentHighestFreq < n) {
                operations++;

                if (currentHighestFreq * 2 <= n) {
                    operations += currentHighestFreq;
                    currentHighestFreq *= 2;
                } else {
                    operations += n - currentHighestFreq;
                    currentHighestFreq = n;
                }
            }

            System.out.println(operations);
        }

        sc.close();
    }
}
