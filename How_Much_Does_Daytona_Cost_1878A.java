import java.util.*;

public class How_Much_Does_Daytona_Cost_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int target = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;

            for (int x : arr) {
                if (x == target) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}