package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11054 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          int[] arr = new int[N];
          int[] dpUp = new int[N];
          int[] dpDown = new int[N];
          int[] dpSum = new int[N];

          StringTokenizer st = new StringTokenizer(br.readLine());
          for (int i = 0; i < N; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
          }

          dpUp[0] = 1;
          for (int i = 1; i < N; i++) {
               int max = 0;
               for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j] && dpUp[j] > max) {
                         max = dpUp[j];
                    }
               }
               dpUp[i] = max + 1;
          }

          dpDown[N - 1] = 1;
          for (int i = N - 2; i >= 0; i--) {
               int max2 = 0;
               for (int j = N - 1; j > i; j--) {
                    if (arr[i] > arr[j] && dpDown[j] > max2) {
                         max2 = dpDown[j];
                    }
               }
               dpDown[i] = max2 + 1;
          }

          int maxSum = 0;
          for (int i = 0; i < N; i++) {
               dpSum[i] = dpUp[i] + dpDown[i] - 1;
               if (dpSum[i] > maxSum) {
                    maxSum = dpSum[i];
               }
          }
          System.out.println(maxSum);
//          System.out.println(Arrays.toString(dpUp));
//          System.out.println(Arrays.toString(dpDown));
     }
}
