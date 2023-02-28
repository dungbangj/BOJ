package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2193 {

     static long[][] dp;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          dp = new long[N + 1][2];
          dp[1][0] = 0;
          dp[1][1] = 1;
          for (int i = 2; i <= N; i++) {
               for (int j = 0; j < 2; j++) {
                    if (j == 1)
                         dp[i][j] = dp[i - 1][0];
                    else {
                         dp[i][j] = dp[i - 1][0] + dp[i - 1][1];
                    }
               }
          }
          System.out.println(dp[N][0] + dp[N][1]);
     }
}
