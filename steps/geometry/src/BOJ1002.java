import java.io.*;
import java.util.StringTokenizer;

public class BOJ1002 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          for (int i = 0; i < num; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int x1 = Integer.parseInt(st.nextToken());
               int y1 = Integer.parseInt(st.nextToken());
               int r1 = Integer.parseInt(st.nextToken());
               int x2 = Integer.parseInt(st.nextToken());
               int y2 = Integer.parseInt(st.nextToken());
               int r2 = Integer.parseInt(st.nextToken());
               double distance = MySqr(x2 - x1, y2 - y1);
               double distance2 = r1 + r2;
               int res;
               if (distance > distance2 || (distance == 0 && r1 != r2) || distance + Math.min(r1, r2) < Math.max(r1, r2)) res = 0;
               else if (distance == 0 && r1 == r2) res = -1;
               else if (distance == distance2 || distance + Math.min(r1, r2) == Math.max(r1, r2)) res = 1;
               else res = 2;
               bw.write(res + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static double MySqr(int a, int b) {
          return Math.pow(a * a + b * b, 0.5);
     }
}
