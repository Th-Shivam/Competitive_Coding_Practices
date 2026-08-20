import java.util.Scanner;

public class Comparison_String_1837B {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long n = sc.nextLong();
            String s = sc.next();

            long longestSubstringLength = 1;
            long currentSubstringLength = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentSubstringLength++;
                } else {
                    longestSubstringLength =
                            Math.max(longestSubstringLength, currentSubstringLength);

                    currentSubstringLength = 1;
                }
            }

            longestSubstringLength =
                    Math.max(longestSubstringLength, currentSubstringLength);

            System.out.println(longestSubstringLength + 1);
        }

        sc.close();
    }
}
