package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9465 {

     public static void main(String[] args) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int T = Integer.parseInt(br.readLine());

          for (int i = 0; i < T; i++) {

               int col = Integer.parseInt(br.readLine());
               int[][] dp = new int[2][col + 1];
               int[][] arr = new int[2][col + 1];

               for (int j = 0; j < 2; j++) {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    for (int k = 1; k <= col; k++) {
                         arr[j][k] = Integer.parseInt(st.nextToken());
                    }
               }
               dp[0][1] = arr[0][1];
               dp[1][1] = arr[1][1];
               for (int k = 2; k <= col; k++) {
                    dp[0][k] = Math.max(dp[1][k - 1], dp[1][k - 2]) + arr[0][k];
                    dp[1][k] = Math.max(dp[0][k - 1], dp[0][k - 2]) + arr[1][k];
               }
               System.out.println(Math.max(dp[0][col], dp[1][col]));
          }
     }
}
