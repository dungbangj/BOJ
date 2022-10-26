package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {

     private static long[] dp;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          long T = Long.parseLong(br.readLine());
          long[] arr = new long[(int) T];
          dp = new long[101];
          dp[1] = dp[2] = dp[3] = 1;
          dp[4] = dp[5] = 2;
          long max = 0;
          for (int i = 0; i < T; i++) {
               arr[i] = Integer.parseInt(br.readLine());
               if (arr[i] > max)
                    max = arr[i];
          }

          if (max >= 6) {
               for (int i = 6; i <= max; i++) {
                    dp[i] = dp[i - 1] + dp[i - 5];
               }
          }
          for (int i = 0; i < T; i++) {
               System.out.println(dp[(int) arr[i]]);
          }
     }
}
