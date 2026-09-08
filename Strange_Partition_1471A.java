import java.util.Scanner;

public class Strange_Partition_1471A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int tt = sc.nextInt();
        
        while (tt-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            
            long minSum = 0;
            long maxAns = 0;
            
            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();
                

                maxAns += (val + x - 1) / x; 
                
                
                minSum += val;
            }

          
            long minAns = (minSum + x - 1) / x;
            
            System.out.println(minAns + " " + maxAns);
        }
        
        sc.close();
    }
}
