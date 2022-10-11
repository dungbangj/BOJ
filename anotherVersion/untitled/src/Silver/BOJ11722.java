package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11722 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          int[] arr = new int[N];
          int[] dp = new int[N];

          StringTokenizer st = new StringTokenizer(br.readLine());
          for (int i = 0; i < N; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
          }

          dp[0] = 1;
          int dpMax = 1;
          for (int i = 1; i < N; i++) {
               int max = 0;
               for (int j = 0; j < i; j++) {
                    if (dp[j] > max && arr[i] < arr[j])
                         max = dp[j];
               }
               dp[i] = max + 1;
               if (dpMax < dp[i])
                    dpMax = dp[i];
          }
          System.out.println(dpMax);
     }
}
