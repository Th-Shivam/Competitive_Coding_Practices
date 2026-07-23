import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class United_We_Stand_1859A {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            int mn = a[0];

            for (int x : a) {
                if (x == mn)
                    b.add(x);
                else
                    c.add(x);
            }

            if (c.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());

                for (int x : b)
                    System.out.print(x + " ");
                System.out.println();

                for (int x : c)
                    System.out.print(x + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
