import java.util.Scanner;

public class Sum_of_Medians_1440B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int totalSize = n * k;
            long[] v = new long[totalSize];
            
            for (int i = 0; i < totalSize; i++) {
                v[i] = sc.nextLong();
            }

            int pointer = totalSize;
            long sum = 0;
            
           
            while (k-- > 0) {
                
                pointer -= (n / 2 + 1);
                sum += v[pointer];
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}
