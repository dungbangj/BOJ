import java.io.*;
import java.util.StringTokenizer;

public class BOJ2609 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int a = Integer.parseInt(st.nextToken());
          int b = Integer.parseInt(st.nextToken());
          int big = Math.max(a, b);
          int small = Math.min(a, b);
          int gcd = gcd(big, small);
          bw.write(gcd + "\n");
          bw.write(big * small / gcd + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static int gcd(int big, int small) {
          if (small == 0) return big;
          else return gcd(small, big % small);
     }
}
