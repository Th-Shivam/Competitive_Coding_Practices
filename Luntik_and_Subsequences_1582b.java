import java.util.Scanner;

public class Luntik_and_Subsequences_1582b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            int n = sc.nextInt();

            long countOfOnes = 0;
            long countOfZeros = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                if (x == 1)
                    countOfOnes++;
                else if (x == 0)
                    countOfZeros++;
            }

            long ways = (long) Math.pow(2, countOfZeros) * countOfOnes;

            System.out.println(ways);
        }

        sc.close();
    }
}