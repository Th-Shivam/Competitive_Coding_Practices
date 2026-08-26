import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NIT_Destroys_Universe {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            int countOfZero = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] == 0) {
                    countOfZero++;
                }
            }

            if (countOfZero == n) {
                System.out.println(0);
                continue;
            }

            int left = 0;
            int right = n - 1;

            while (left < n && a[left] == 0) {
                left++;
            }

            while (right >= 0 && a[right] == 0) {
                right--;
            }

            boolean foundZero = false;
            for (int i = left; i <= right; i++) {
                if (a[i] == 0) {
                    foundZero = true;
                    break;
                }
            }

            if (!foundZero) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }

    // Fast I/O helper class for competitive programming in Java
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null)
                        return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
