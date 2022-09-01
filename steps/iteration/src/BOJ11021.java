import java.io.*;
import java.util.StringTokenizer;

public class BOJ11021 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          StringTokenizer st;
          int i = 1;

          while (i <= num) {
               st = new StringTokenizer(br.readLine());
               bw.write("Case #" + i + ": "+ (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
               i++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
