import java.util.Scanner;

public class Deletive_Editing_1666D {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            String s = sc.next();
            String t = sc.next();

            int n = s.length();
            int m = t.length();

            int[] frequencyInT = new int[26];

            for (int i = 0; i < m; i++) {
                frequencyInT[t.charAt(i) - 'A']++;
            }

            char[] sArray = s.toCharArray();

            for (int i = n - 1; i >= 0; i--) {
                int index = sArray[i] - 'A';

                if (frequencyInT[index] > 0) {
                    frequencyInT[index]--;
                } else {
                    sArray[i] = '.';
                }
            }

            StringBuilder finalString = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (sArray[i] != '.') {
                    finalString.append(sArray[i]);
                }
            }

            if (finalString.toString().equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
