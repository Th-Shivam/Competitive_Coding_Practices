import java.util.Scanner;

public class Threshold_Movement_2250A {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int maxEven = Integer.MIN_VALUE;
            int minOdd = Integer.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();

                if (i % 2 == 0)
                    maxEven = Math.max(maxEven, x);
                else
                    minOdd = Math.min(minOdd, x);
            }

            // n = 1 => impossible
            if (n == 1) {
                System.out.println("NO");
                continue;
            }

            if (minOdd - maxEven >= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
