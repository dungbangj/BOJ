import java.io.*;
import java.util.StringTokenizer;

public class BOJ2869 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int up = Integer.parseInt(st.nextToken());
          int down = Integer.parseInt(st.nextToken());
          int total = Integer.parseInt(st.nextToken());
          double totalD;
          int day = 1;

          total -= up;
          if (total == 0) {
               bw.write(day + "\n");
          } else {
               totalD = (double)total / (up - down);
               if (totalD > (int)totalD)
                    total = (int)totalD + 1;
               else if (totalD == (int)totalD)
                    total = (int)totalD;
               if (total == 0)
                    total = 1;
               bw.write(total + day + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
