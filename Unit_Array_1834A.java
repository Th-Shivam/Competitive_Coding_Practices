import java.util.* ;
public class Unit_Array_1834A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int countOfNegOne  = 0 ;
            int countOfPosOne = 0 ;
            int minOps = 0 ;


            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean allOnes = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 1) {
                    allOnes = false;
                    break;
                }
            }

            if(allOnes) {
                System.out.println(0);
                continue;
            }

            for(int i = 0 ; i<n ; i++){
                if(arr[i] == -1){
                    countOfNegOne++;
                }
                else countOfPosOne++ ;
            }

            while(!(countOfNegOne<=countOfPosOne)){
                minOps++ ;
                countOfNegOne--;
                countOfPosOne++;
            }

            if(countOfNegOne%2 != 0 ) minOps++ ;

            System.out.println(minOps);


        }
        sc.close();
    }
}
