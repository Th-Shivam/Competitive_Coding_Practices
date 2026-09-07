import java.util.Scanner;

public class Odd_Divisor_1475A {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        if (!sc.hasNextLong()) {
            return;
        }
        
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            // Remove powers of 2
            while (n % 2 == 0) {
                n /= 2;
            }
            
            if (n > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
