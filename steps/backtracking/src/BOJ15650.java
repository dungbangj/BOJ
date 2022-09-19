import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15650 {

     static boolean visit[];
     static int arr[];
     static StringBuilder sb = new StringBuilder();

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int N = Integer.parseInt(st.nextToken());
          int M = Integer.parseInt(st.nextToken());
          visit = new boolean[N];
          arr = new int[M];
          dfs(N, M, 0);
          System.out.println(sb);
     }

     static void dfs(int N, int M, int depth) {

          if (M == depth) {
               int flag = 1;
               for (int i = 1; i < M; i++) {
                    if (arr[i - 1] > arr[i])
                         flag = 0;
               }
               if (flag == 1) {
                    for (int val : arr)
                         sb.append(val).append(' ');
                    sb.append('\n');
               }
               return;
          }

          for (int i = 0; i < N; i++) {
               if (!visit[i]) {
                    visit[i] = true;
                    arr[depth] = i + 1;
                    dfs(N, M, depth + 1);
                    visit[i] = false;
               }
          }
     }
}
