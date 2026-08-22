import java.util.Scanner;

public class Odd_Queries_1807D {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            // 1-based indexing
            long[] array = new long[n + 1];
            long[] prefixSum = new long[n + 1];

            long sum = 0;

            for (int i = 1; i <= n; i++) {
                array[i] = sc.nextLong();
                sum += array[i];
                prefixSum[i] = sum;
            }

            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();

                // Sum of elements from l to r
                long temp = prefixSum[r] - prefixSum[l - 1];

                // New total sum after replacing [l, r] with k
                long res = sum - temp + (r - l + 1L) * k;

                if (res % 2 == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }

        sc.close();
    }
}
