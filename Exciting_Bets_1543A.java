import java.util.Scanner;

public class Exciting_Bets_1543A {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b > a) {
                long temp = a;
                a = b;
                b = temp;
            }

            if (a == b) {
                System.out.println("0 0");
            } else {
                long gcd = a - b;
                long moves = Math.min(b % gcd, gcd - (b % gcd));

                System.out.println(gcd + " " + moves);
            }
        }

        sc.close();
    }
}
