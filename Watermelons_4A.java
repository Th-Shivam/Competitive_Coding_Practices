import java.util.Scanner;
public class Watermelons_4A
 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        if(weight == 1 || weight == 2){
           System.out.println("NO");
        }
        if(weight % 2 == 0){
            System.out.println("YES") ;
        }
        sc.close();
    }
}