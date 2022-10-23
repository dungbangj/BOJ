package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2133 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          int[] dp = new int[N + 1];
          if (N >= 2) {
               dp[0] = 0;
               dp[2] = 3;
          }
          if (N >= 4)
               dp[4] = 11;
          int tmp = 0;
          for (int i = 6; i <= N; i += 2) {
               dp[i] = dp[i - 2] * 3 + 2 + (tmp += dp[i - 4] * 2);
          }
          System.out.println(dp[N]);
//          System.out.println(Arrays.toString(dp));
     }
}
