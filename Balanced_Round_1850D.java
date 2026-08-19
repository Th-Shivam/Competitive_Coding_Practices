import java.util.*;
public class Balanced_Round_1850D {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[(int) n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long counter = 1;
            long largestLength = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k) {
                    counter++;
                } else {
                    counter = 1;
                }

                largestLength = Math.max(largestLength, counter);
            }

            System.out.println(n - largestLength);
        }

        sc.close();
    }
}
