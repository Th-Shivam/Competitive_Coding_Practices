import java.util.Arrays;
import java.util.Scanner;

public class Helmets_in_Night_Light_1876A {
    static class Pair implements Comparable<Pair> {
        long cost;      // b[i]
        long capacity;  // a[i]
        
        Pair(long cost, long capacity) {
            this.cost = cost;
            this.capacity = capacity;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.cost != other.cost) {
                return Long.compare(this.cost, other.cost);
            }
            return Long.compare(this.capacity, other.capacity);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long p = sc.nextLong();
            
            long[] a = new long[n];
            long[] b = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            Pair[] v = new Pair[n];
            for (int i = 0; i < n; i++) {
                v[i] = new Pair(b[i], a[i]);
            }

            Arrays.sort(v);

            long minimum_cost = p;
            long already_shared = 1;
            
            for (Pair it : v) {
                long can_be_shared = it.capacity; 
                long sharing_cost = it.cost;      
                

                if (sharing_cost >= p) {
                    break;
                }

                if (already_shared + can_be_shared > n) {
                    minimum_cost += (n - already_shared) * sharing_cost;
                    already_shared = n;
                    break;
                } else {
                    minimum_cost += can_be_shared * sharing_cost;
                    already_shared += can_be_shared;
                }
            }

            minimum_cost += (n - already_shared) * p;
            
            System.out.println(minimum_cost);
        }
        
        sc.close();
    }
}
