import java.util.Scanner;

public class Odd_Grasshopper_1607B {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tt = sc.nextInt();

        while (tt-- > 0) {
            long start = sc.nextLong();
            long jumps = sc.nextLong();

            long finalPos;

            if (jumps % 4 == 1)
                finalPos = -jumps;
            else if (jumps % 4 == 2)
                finalPos = 1;
            else if (jumps % 4 == 3)
                finalPos = jumps + 1;
            else
                finalPos = 0;

            if (start % 2 == 0)
                finalPos = start + finalPos;
            else
                finalPos = start - finalPos;

            System.out.println(finalPos);
        }

        sc.close();
    }
}
