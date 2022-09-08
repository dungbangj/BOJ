import java.io.*;
import java.util.StringTokenizer;

public class BOJ1934 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          for (int i = 0; i < num; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int a = Integer.parseInt(st.nextToken());
               int b = Integer.parseInt(st.nextToken());
               int big = Math.max(a, b);
               int small = Math.min(a, b);
               int gcd = gcd(big, small);
               bw.write(big * small / gcd + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int gcd(int big, int small) {
          if (small == 0) return big;
          return gcd(small, big % small);
     }
}
