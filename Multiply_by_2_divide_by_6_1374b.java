import java.util.Scanner;
class Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long tt = sc.nextLong();
        
        while (tt-- > 0) {
            long n = sc.nextLong();
            
            long count_of_3 = 0;
            long count_of_2 = 0;

            while (n > 0 && n % 3 == 0) {
                count_of_3++;
                n /= 3;
            }

            while (n > 0 && n % 2 == 0) {
                count_of_2++;
                n /= 2;
            }

            if (n > 1 || count_of_2 > count_of_3) {
                System.out.println(-1);
            } else {
                System.out.println(count_of_3 + (count_of_3 - count_of_2));
            }
        }
        
        sc.close();
    }
}