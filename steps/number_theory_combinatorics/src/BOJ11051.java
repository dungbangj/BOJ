import java.io.*;
import java.util.StringTokenizer;

public class BOJ11051 {
     static int[][] dp;
     static int div = 10007;

     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int N = Integer.parseInt(st.nextToken());
          int K = Integer.parseInt(st.nextToken());
          dp = new int[N + 1][K + 1];
          bw.write(BC(N, K) + "\n");

          br.close();
          bw.flush();
          bw.close();
     }

     static int BC(int n, int k) {
          if (dp[n][k] > 0)
               return dp[n][k];
          if (k == 0 || n == k)
               return dp[n][k] = 1;
          return dp[n][k] = (BC(n - 1, k - 1) + BC(n - 1, k)) % div;
     }


}
