import java.util.*;
import java.io.*;

public class Merge_to_Match_2248B {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = nextInt(in);
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = nextInt(in);
            int m = nextInt(in);
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt(in);
            int[] b = new int[m];
            for (int i = 0; i < m; i++) b[i] = nextInt(in);

            Arrays.sort(a);
            Arrays.sort(b);

            boolean ok = true;
            if (n < 2 * m) {
                ok = false;
            } else {
                int i = 0;
                for (int j = 0; j < m; j++) {
                    while (i < n && a[i] < b[j]) i++;
                    int cnt = i;
                    int need1 = j + 1;
                    int need2 = n - m + j; // cnt <= n - m + (j+1) - 1
                    if (cnt < need1 || cnt > need2) {
                        ok = false;
                        break;
                    }
                }
            }
            sb.append(ok ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        while (b < '0' || b > '9') {
            if (b == '-') break;
            b = in.read();
        }
        boolean neg = false;
        if (b == '-') { neg = true; b = in.read(); }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return neg ? -ret : ret;
    }
}