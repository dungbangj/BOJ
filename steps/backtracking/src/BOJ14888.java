import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {

     static int[] number;
     static int[] oper = new int[4];
     static int N;
     static int numMax = Integer.MIN_VALUE;
     static int numMin = Integer.MAX_VALUE;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          N = Integer.parseInt(br.readLine());

          number = new int[N];
          StringTokenizer st = new StringTokenizer(br.readLine());
          for (int i = 0; i < N; i++) {
               number[i] = Integer.parseInt(st.nextToken());
          }

          st = new StringTokenizer(br.readLine());
          for (int i = 0; i < 4; i++) {
               oper[i] = Integer.parseInt(st.nextToken());
          }
          dfs(number[0], 1);
          System.out.println(numMax + "\n" + numMin);
     }

     static void dfs(int num, int idx) {
          if (idx == N) {
               numMax = Math.max(num, numMax);
               numMin = Math.min(num, numMin);
               return;
          }

          for (int i = 0; i < 4; i++) {
               if (oper[i] > 0) {
                    oper[i]--;
                    switch (i) {
                         case 0:
                              dfs(num + number[idx], idx + 1);
                              break;
                         case 1:
                              dfs(num - number[idx], idx + 1);
                              break;
                         case 2:
                              dfs(num * number[idx], idx + 1);
                              break;
                         case 3:
                              dfs(num / number[idx], idx + 1);
                              break;
                    }
                    oper[i]++;
               }
          }
     }
}
