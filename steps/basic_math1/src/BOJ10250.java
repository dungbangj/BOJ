import java.io.*;
import java.util.StringTokenizer;

public class BOJ10250 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());

          while (num > 0) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int H = Integer.parseInt(st.nextToken());
               int W = Integer.parseInt(st.nextToken());
               int N = Integer.parseInt(st.nextToken());

               double r = (double) N / H;
               int R = 0;
               if (r == (int) r)
                    R = (int) r;
               else if (r != (int) r)
                    R = (int) r + 1;

               int F = N % H;
               if (F == 0)
                    F = H;
               if (R < 10)
                    bw.write(F + "0" + R + "\n");
               else
                    bw.write(F + "" + R + "\n");
               num--;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
