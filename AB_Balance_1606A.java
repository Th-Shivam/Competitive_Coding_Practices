import java.util.Scanner;

public class AB_Balance_1606A {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            String s = sc.next();
            int n = s.length();

            char[] chars = s.toCharArray();

            if (chars[0] != chars[n - 1]) {
                if (chars[0] == 'a')
                    chars[0] = 'b';
                else
                    chars[0] = 'a';
            }

            System.out.println(new String(chars));
        }

        sc.close();
    }
}
