import java.util.* ;
public class Game_01_767 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int tt = sc.nextInt();
        
        while (tt-- > 0) {
            String s = sc.next();
            
            int count_of_one = 0;
            int count_of_zero = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    count_of_zero++;
                } else {
                    count_of_one++;
                }
            }

            int operations = Math.min(count_of_zero, count_of_one);
            
            if (operations % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        
        sc.close();
    }
}
