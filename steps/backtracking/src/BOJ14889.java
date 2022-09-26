import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14889 {

     static int N;
     static int[][] map;
     static boolean[] visit;

     static int MIN = Integer.MAX_VALUE;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          N = Integer.parseInt(br.readLine());
          map = new int[N][N];
          visit = new boolean[N];

          for (int i = 0; i < N; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
               }
          }
          combi(0, 0);
          System.out.println(MIN);
     }

     static void combi(int idx, int count) {
          if (count == N / 2) {
               diff();
               return;
          }

          for (int i = idx; i < N; i++) {
               visit[i] = true;
               combi(i + 1, count + 1);
               visit[i] = false;
          }
     }

     static void diff() {
          int teamStart = 0;
          int teamLink = 0;

          for (int i = 0; i < N - 1; i++) {
               for (int j = i + 1; j < N; j++) {
                    if (visit[i] && visit[j]) {
                         teamStart += map[i][j];
                         teamStart += map[j][i];
                    } else if (!visit[i] && !visit[j]) {
                         teamLink += map[i][j];
                         teamLink += map[j][i];
                    }
               }
          }

          int diff = Math.abs(teamStart - teamLink);
          if (diff == 0) {
               System.out.println(diff);
               System.exit(0);
          }
          MIN = Math.min(diff, MIN);
     }
}
