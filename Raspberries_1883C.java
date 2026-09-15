import java.util.Scanner;

public class Raspberries_1883C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long t = sc.nextLong();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            long ans = Long.MAX_VALUE; 
            long even_count = 0;
            
            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();

                if (val % 2 == 0) {
                    even_count++;
                }

                if (val % k == 0) {
                    ans = 0;
                } else {
                    ans = Math.min(ans, (k - (val % k)));
                }
            }

            if (k == 4) {
                if (even_count >= 2) {
                    ans = Math.min(ans, 0L);
                } else if (even_count == 1) {
                    ans = Math.min(ans, 1L);
                } else { // even_count == 0
                    ans = Math.min(ans, 2L);
                }
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
