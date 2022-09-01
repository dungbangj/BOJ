import java.io.*;
import java.util.StringTokenizer;

public class BOJ11022 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          StringTokenizer st;
          int i = 1;
          int a = 0;
          int b = 0;

          while (i <= num) {
               st = new StringTokenizer(br.readLine());
               a = Integer.parseInt(st.nextToken());
               b = Integer.parseInt(st.nextToken());
               bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
               bw.newLine();
               i++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
