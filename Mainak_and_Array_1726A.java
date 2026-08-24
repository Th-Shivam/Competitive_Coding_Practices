import java.util.Scanner;

public class Mainak_and_Array_1726A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long n = sc.nextLong();

            long[] v = new long[(int) n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            long answer = v[(int) n - 1] - v[0];

            for (int i = 1; i < n; i++) {
                answer = Math.max(answer, v[i] - v[0]);
            }

            for (int i = 0; i < n - 1; i++) {
                answer = Math.max(answer, v[(int) n - 1] - v[i]);
            }

            for (int i = 0; i < n - 1; i++) {
                answer = Math.max(answer, v[i] - v[i + 1]);
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
