import java.io.*;
import java.util.StringTokenizer;

public class BOJ1929 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int a = Integer.parseInt(st.nextToken());
          int b = Integer.parseInt(st.nextToken());
          boolean[] priArr = new boolean[b + 1];
          priArr[0] = true;
          priArr[1] = true;
          int i = 2;
          while (i <= b) {
               int j = 2;
               while (i * j <= b)
                    priArr[i * j++] = true;
               i++;
          }
          i = a;
          while (i <= b) {
               if (!priArr[i]) {
                    bw.write(i + "\n");
               }
               i++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
