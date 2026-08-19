import java.util.Scanner;

public class Longest_Divisors_Interval_1855B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long n = sc.nextLong();

            int i = 1;

            while (n % i == 0) {
                i++;
            }

            System.out.println(i - 1);
        }

        sc.close();
    }
}
