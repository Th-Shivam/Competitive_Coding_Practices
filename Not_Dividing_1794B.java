import java.util.Scanner;

public class Not_Dividing_1794B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    a[i]++;
                }
            }

            // n
            for (int i = 0; i < n - 1; i++) {
                if (a[i + 1] % a[i] == 0) {
                    a[i + 1]++;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
