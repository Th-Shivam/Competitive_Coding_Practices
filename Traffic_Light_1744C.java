import java.util.Scanner;

public class Traffic_Light_1744C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long t = sc.nextLong();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            char color = sc.next().charAt(0);
            String s = sc.next();
            
            s += s;
            n *= 2;
            
            long last_green_index = -1;
            long max_seconds = Long.MIN_VALUE;
            
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'g') {
                    last_green_index = i;
                }
                if (s.charAt(i) == color) {
                    long difference = last_green_index - i;
                    max_seconds = Math.max(max_seconds, difference);
                }
            }
            
            System.out.println(max_seconds);
        }
        
        sc.close();
    }
}
