import java.util.*;
public class Boss_Fight_2252A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            int maxFreq = 0;
            int value = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    value = entry.getKey();
                }
            }

            int others = n - maxFreq;

            if (maxFreq <= others + 2) {
                System.out.println(sum);
            } else {
                int usable = others + 2;
                int ans = sum - (maxFreq - usable) * value;
                System.out.println(ans);
            }
        }

        sc.close();
    }
}
