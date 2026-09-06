import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bad_Boy_1537B {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long i = Long.parseLong(st.nextToken());
            long j = Long.parseLong(st.nextToken());
            

            sb.append(1).append(" ").append(1).append(" ")
              .append(n).append(" ").append(m).append("\n");
        }
        System.out.print(sb);
    }
}
