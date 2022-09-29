package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10844_topdown {

     static int N;
     static Long[][] dp;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          N = Integer.parseInt(br.readLine());
          dp = new Long[N + 1][10];

          for (int i = 0; i < 10; i++) {
               dp[1][i] = 1L;
          }

          long count = 0;
          for (int i = 1; i <= 9; i++) {
               count += recur(i, N);
          }
          System.out.println(count % 1000000000);
     }

     static long recur(int num, int size) {

          if (size == 1) {
               return dp[size][num];
          }

          if (dp[size][num] == null) {
               if (num == 0){
                    dp[size][num] = recur(1, size - 1);
               } else if (num == 9) {
                    dp[size][num] = recur(8, size - 1);
               } else {
                    dp[size][num] = recur(num - 1, size - 1) + recur(num + 1, size - 1);
               }
          }
          return dp[size][num] % 1000000000;
     }
}