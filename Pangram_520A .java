import java.util.*;
public class Pangram_520A  {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next().toLowerCase();

        boolean[] vis = new boolean[26];

        for (int i = 0; i < n; i++) {
            vis[s.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!vis[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        sc.close();
    }
}
