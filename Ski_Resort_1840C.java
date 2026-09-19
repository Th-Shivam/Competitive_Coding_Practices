import java.util.Scanner;

public class Ski_Resort_1840C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long tt = sc.nextLong();
        
        while (tt-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long q = sc.nextLong();
            
            long count_of_1s = 0;
            long ways = 0;
            
            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();

                if (val <= q) {
                    count_of_1s++;
                } else {

                    if (count_of_1s >= k) {
                        long diff = count_of_1s - k + 1;
                        ways += (diff * (diff + 1)) / 2;
                    }

                    count_of_1s = 0;
                }
            }

            if (count_of_1s >= k) {
                long diff = count_of_1s - k + 1;
                ways += (diff * (diff + 1)) / 2;
            }
            
            System.out.println(ways);
        }
        
        sc.close();
    }
}
