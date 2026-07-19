import java.util.*;

public class How_Much_Does_Daytona_Cost_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int target = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean isIFound = false;
            int i = 0;
            while (i < n && isIFound == false) {
                if (arr[i] == target) {
                    isIFound = true;
                    HashMap<Integer, Integer> mp = new HashMap<>();
                    for (int j = i; j < n; j++) {
                        mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);

                    }

                    int targetfreq = mp.get(target);
                    int otherFreq = 0;

                    for (int key : mp.keySet()) {
                        if (key != target) {
                            otherFreq = Math.max(otherFreq, mp.get(key));
                        }
                    }
                    if (targetfreq > otherFreq) {
                        System.out.println("Yes");
                    } else
                        System.out.println("No");
                }

                i++;
            }

            if (!isIFound) {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}