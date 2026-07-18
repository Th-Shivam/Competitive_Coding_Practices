import java.util.* ;

public class Yet_Another_Constructive_2247B {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long m = sc.nextLong();

            // Impossible
            if (k > m) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            long prev = 0;

            for (int i = 1; i <= n; i++) {
                long curr = i % k;

                long diff = (curr - prev + m) % m;

                if (diff == 0)
                    diff = m;

                System.out.print(diff);

                if (i != n)
                    System.out.print(" ");

                prev = curr;
            }

            System.out.println();
        }

        sc.close();
    }
}
