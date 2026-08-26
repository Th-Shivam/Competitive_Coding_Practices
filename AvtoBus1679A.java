import java.util.Scanner;

public class AvtoBus1679A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long n = sc.nextLong();

            if (n % 2 != 0 || n < 4) {
                System.out.println(-1);
                continue;
            }

            long minBuses = (n + 5) / 6;
            long maxBuses = n / 4;

            System.out.println(minBuses + " " + maxBuses);
        }

        sc.close();
    }
}
