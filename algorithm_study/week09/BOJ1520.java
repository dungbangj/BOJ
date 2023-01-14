import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1520 {

    static final int ORIGIN = -1;
    static final int[] MOVE_M = {1, -1, 0, 0};
    static final int[] MOVE_N = {0, 0, 1, -1};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] roads;
    static int[][] visited;
    static int M, N;

    public static void main(String[] args) throws IOException {
        initRoads();
        fillRoads();
        System.out.println(dfs(0, 0));
    }

    private static void fillRoads() throws IOException {
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                roads[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = ORIGIN;
            }
        }
    }

    private static void initRoads() throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        roads = new int[M][N];
        visited = new int[M][N];
    }

    private static int dfs(int x, int y) {

        if (isAtDestination(x, y)){
            return 1;
        }

        if (haveVisited(x, y)) {
            return visited[x][y];
        }
        visited[x][y] = 0;

        for (int i = 0; i < MOVE_M.length; i++) {
            int newX = x + MOVE_M[i];
            int newY = y + MOVE_N[i];
            if (isInRange(newX, newY)) {
                if (roads[x][y] > roads[newX][newY]) {
                    visited[x][y] += dfs(newX, newY);
                }
            }
        }
        return visited[x][y];
    }

    private static boolean isInRange(int newX, int newY) {
        return 0 <= newX && newX < M && 0 <= newY && newY < N;
    }

    private static boolean isAtDestination(int x, int y) {
        return x == M - 1 && y == N - 1;
    }

    private static boolean haveVisited(int x, int y) {
        return visited[x][y] != ORIGIN;
    }
}

