import java.util.*;

public class You_Delete_I_Delete_2248A {
    static String removeChar(String s, int idx) {
        return s.substring(0, idx) + s.substring(idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            String best = "";

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') continue;

                // Alice deletes this 0
                String afterAlice = removeChar(s, i);

                // Bob deletes the leftmost 1
                int firstOne = afterAlice.indexOf('1');
                String afterBob = removeChar(afterAlice, firstOne);

                if (best.isEmpty() || afterBob.compareTo(best) > 0) {
                    best = afterBob;
                }
            }

            System.out.println(best);
        }
        sc.close();
    }
}