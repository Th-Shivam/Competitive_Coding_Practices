import java.util.Scanner;

public class Distinct_Split_1791D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int tt = sc.nextInt();
        
        while (tt-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int[] leftFreq = new int[26];
            int[] rightFreq = new int[26];
            
            int leftUnique = 0;
            int rightUnique = 0;
            
            for (int i = 0; i < n; i++) {
                int charIndex = s.charAt(i) - 'a';
                if (rightFreq[charIndex] == 0) {
                    rightUnique++;
                }
                rightFreq[charIndex]++;
            }
            
            int maxAns = 0;
            
            for (int i = 0; i < n; i++) {
                int charIndex = s.charAt(i) - 'a';
                
                if (leftFreq[charIndex] == 0) {
                    leftUnique++;
                }
                leftFreq[charIndex]++;
                
                rightFreq[charIndex]--;
                if (rightFreq[charIndex] == 0) {
                    rightUnique--;
                }
                
                maxAns = Math.max(maxAns, leftUnique + rightUnique);
            }
            
            System.out.println(maxAns);
        }
        
        sc.close();
    }
}
