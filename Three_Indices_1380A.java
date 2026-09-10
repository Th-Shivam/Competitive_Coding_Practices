import java.util.Scanner;

public class Three_Indices_1380A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long tt = sc.nextLong();
        
        while (tt-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean found = false; 
            
            for (int j = 1; j < n - 1; j++) {
                int i_idx = -1;
                int k_idx = -1;
                
                
                for (int left = 0; left < j; left++) {
                    if (a[left] < a[j]) {
                        i_idx = left;
                        break;
                    }
                }
                
               
                for (int right = j + 1; right < n; right++) {
                    if (a[right] < a[j]) {
                        k_idx = right;
                        break;
                    }
                }
                
               
                if (i_idx != -1 && k_idx != -1) {
                    System.out.println("YES");
                    System.out.println((i_idx + 1) + " " + (j + 1) + " " + (k_idx + 1));
                    found = true;
                    break;
                }
            } 
            
            if (!found) {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
