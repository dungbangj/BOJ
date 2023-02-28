package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11727 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          int[] dp = new int[N + 1];
          for (int i = 0; i <= N; i++) {
               if (i == 0) dp[0] = 0;
               else if (i == 1) dp[1] = 1;
               else if (i == 2) dp[2] = 3;
               else
                    dp[i] = (dp[i - 2] * 2 + dp[i - 1]) % 10007;
          }
          System.out.println(dp[N]);
     }
}

//0 0
//1 1
//2 3
//3 5 (+2)
//4 11 (+6)