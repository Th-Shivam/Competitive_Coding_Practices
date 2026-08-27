import java.util.Scanner;

public class Make_it_Increasing_1675B {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long n = sc.nextLong();

            long[] a = new long[(int) n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long ans = 0;

            for (int i = (int) n - 2; i >= 0; i--) {
                while (a[i] >= a[i + 1]) {
                    ans++;
                    a[i] /= 2;

                    if (a[i] == 0) {
                        break;
                    }
                }

                if (a[i] == 0 && a[i + 1] == 0) {
                    ans = -1;
                    break;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
