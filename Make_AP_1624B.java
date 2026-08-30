import java.util.Scanner;

public class Make_AP_1624B {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            boolean answer = false;

            long newA = 2 * b - c;
            if (newA / a > 0 && newA % a == 0) {
                answer = true;
            }

            long newB = (a + c) / 2;
            if (newB / b > 0 && newB % b == 0 && (c - a) % 2 == 0) {
                answer = true;
            }

            long newC = 2 * b - a;
            if (newC / c > 0 && newC % c == 0) {
                answer = true;
            }

            if (answer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
