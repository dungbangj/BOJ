import java.io.*;
import java.net.Inet4Address;
import java.util.StringTokenizer;

public class BOJ10952 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int sum;
          while (true) {
               sum = 0;
               StringTokenizer st = new StringTokenizer(br.readLine());
               sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
               if (sum == 0)
                    break;
               else
                    bw.write(sum + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
