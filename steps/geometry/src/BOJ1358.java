import java.io.*;
import java.util.StringTokenizer;

public class BOJ1358 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int W = Integer.parseInt(st.nextToken());
          int H = Integer.parseInt(st.nextToken());
          int X = Integer.parseInt(st.nextToken());
          int Y = Integer.parseInt(st.nextToken());
          int P = Integer.parseInt(st.nextToken());
          int count = 0;
          for (int i = 0; i < P; i++) {
               st = new StringTokenizer(br.readLine());
               int x = Integer.parseInt(st.nextToken());
               int y = Integer.parseInt(st.nextToken());
               if (MySqr(X - x, (Y + H / 2) - y) <= (double) H / 2 || MySqr((X + W) - x, (Y + H / 2) - y) <= (double) H / 2 || ((X <= x && x <= X + W) && (Y <= y && y <= Y + H)))
                    count++;
          }
          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static double MySqr(int a, int b) {
          return Math.pow(a * a + b * b, 0.5);
     }
}
