import java.util.Arrays;
import java.util.Scanner;

public class Monsters_1849B {
    static class Monster implements Comparable<Monster> {
        long health;
        long index;
        
        Monster(long health, long index) {
            this.health = health;
            this.index = index;
        }
        
        @Override
        public int compareTo(Monster other) {
          
            if (this.health != other.health) {
                return Long.compare(other.health, this.health);
            }

            return Long.compare(this.index, other.index);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long tt = sc.nextLong();
        
        while (tt-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            Monster[] health_points = new Monster[n];
            
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                
             
                long rem = x % k;
                if (rem == 0) {
                    rem = k;
                }
                
            
                health_points[i] = new Monster(rem, i + 1);
            }
          
            Arrays.sort(health_points);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(health_points[i].index).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        
        sc.close();
    }
}
