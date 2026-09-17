import java.util.Arrays;
import java.util.Scanner;

public class Olya_and_Game_with_Arrays_1859b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long tt = sc.nextLong();
        
        while (tt-- > 0) {
            int n = sc.nextInt();

            long lowest_first_minimum = Long.MAX_VALUE;
            long lowest_second_minimum = Long.MAX_VALUE;
            long sum_of_second_elements = 0;
            
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                long[] a = new long[m];
                
                for (int j = 0; j < m; j++) {
                    a[j] = sc.nextLong();
                }
                
                Arrays.sort(a);
                
                lowest_first_minimum = Math.min(lowest_first_minimum, a[0]);

                sum_of_second_elements += a[1];
                lowest_second_minimum = Math.min(lowest_second_minimum, a[1]);
            }

            long answer = lowest_first_minimum + sum_of_second_elements - lowest_second_minimum;
            System.out.println(answer);
        }
        
        sc.close();
    }
}
