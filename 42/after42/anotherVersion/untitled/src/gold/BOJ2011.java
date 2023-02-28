package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2011 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String pw = br.readLine();
          int n = pw.length();
          int[] dp = new int[n + 1];
          char[] ch = new char[n + 1];

          for(int i = 1; i <= n; i++) {
               ch[i] = pw.charAt(i-1);
          }

          dp[0] = 1;
          for(int i = 1; i <= n; i++) {
               int num = ch[i] - '0';
               if(1 <= num && num <= 9) {
                    dp[i] = dp[i-1];
                    dp[i] %= 1000000;
               }
               if(i == 1) continue;

               num = (ch[i-1] - '0') * 10 + (ch[i] - '0');
               if(10 <= num && num <= 26) {
                    dp[i] += dp[i-2];
                    dp[i] %= 1000000;
               }
          }
          System.out.println(dp[n]);
     }
}
