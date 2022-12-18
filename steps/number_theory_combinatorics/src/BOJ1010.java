import java.io.*;
import java.util.StringTokenizer;

public class BOJ1010 {

     static int[][] dp = new int[30][30];

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          for (int i = 0; i < num; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int N = Integer.parseInt(st.nextToken());
               int M = Integer.parseInt(st.nextToken());
               bw.write(BC(M, N) + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int BC(int N, int M) {
          if (dp[N][M] > 0) {
               return dp[N][M];
          }
          if (N == M || M == 0) {
               return dp[N][M] = 1;
          }
          return dp[N][M] = BC(N - 1, M - 1) + BC(N - 1, M);
     }
}
