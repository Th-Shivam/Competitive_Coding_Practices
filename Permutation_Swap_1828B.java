import java.util.Scanner;

public class Permutation_Swap_1828B {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long tt = sc.nextLong();

        while (tt-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int k = Math.abs(a[0] - 1);

            for (int i = 1; i < n; i++) {
                k = gcd(k, Math.abs(a[i] - (i + 1)));
            }

            System.out.println(k);
        }

        sc.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
