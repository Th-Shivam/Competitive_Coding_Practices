import java.util.ArrayList;
import java.util.Scanner;

public class Sequence_Game_1862B {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(arr[0]);

            for (int i = 1; i < n; i++) {
                if (arr[i] >= arr[i - 1]) {
                    ans.add(arr[i]);
                } else {
                    ans.add(1);
                    ans.add(arr[i]);
                }
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
