import java.io.*;
import java.util.StringTokenizer;

public class BOJ1712 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          long a = Integer.parseInt(st.nextToken());
          long b = Integer.parseInt(st.nextToken());
          long c = Integer.parseInt(st.nextToken());

          if (b == c)
               bw.write(-1 + "\n");
          else if (a / (c - b) >= 0)
               bw.write(a / (c - b) + 1 + "\n");
          else
               bw.write(-1 + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
