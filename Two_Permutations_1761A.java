import java.util.Scanner;

public class Two_Permutations_1761A {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long n, a, b;

            n = sc.nextLong();
            a = sc.nextLong();
            b = sc.nextLong();

            if (a + b + 2 <= n || (a == b && a == n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

}
