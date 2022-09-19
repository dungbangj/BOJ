import java.io.*;
import java.util.StringTokenizer;

public class BOJ15649 {

     static StringBuilder sb = new StringBuilder();
     static boolean[] visit;
     static int[] arr;

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
               for (int val : arr) {
                    sb.append(val).append(' ');
               }
               sb.append('\n');
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
