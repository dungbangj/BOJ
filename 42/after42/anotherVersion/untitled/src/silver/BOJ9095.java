package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          int[] dp = new int[12];
          for (int i = 0; i <= 11; i++) {
               if (i == 0) dp[0] = 0;
               else if (i == 1) dp[1] = 1;
               else if (i == 2) dp[2] = 2;
               else if (i == 3) dp[3] = 4;
               else if (i == 4) dp[4] = 7;
               else
                    dp[i] = dp[i - 2] + dp[i - 1] + dp[i - 3];

          }
          for (int i = 0; i < N; i++) {
               System.out.println(dp[Integer.parseInt(br.readLine())]);
          }
     }
}
