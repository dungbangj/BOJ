import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1520 {

    static final int NOT_VISITED = -1;
    static final int VISITED = 0;
    static final int ARRIVED = 1;
    static final int[] MOVE_M = {1, -1, 0, 0};
    static final int[] MOVE_N = {0, 0, 1, -1};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] roads;
    static int[][] visitCounts;
    static int M, N;

    public static void main(String[] args) throws IOException {
        initRoads();
        fillRoads();
        System.out.println(dfs(0, 0));
    }

    private static void initRoads() throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        roads = new int[M][N];
        visitCounts = new int[M][N];
    }

    private static void fillRoads() throws IOException {
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                roads[i][j] = Integer.parseInt(st.nextToken());
                visitCounts[i][j] = NOT_VISITED;
            }
        }
    }

    private static int dfs(int x, int y) {

        if (arrivedAtDest(x, y)) {
            return ARRIVED;
        }

        if (alreadyVisited(x, y)) {
            return visitCounts[x][y];
        }
        visitCounts[x][y] = VISITED;

        for (int i = 0; i < MOVE_M.length; i++) {
            int newX = x + MOVE_M[i];
            int newY = y + MOVE_N[i];
            if (isInRange(newX, newY) && canMove(x, y, newX, newY)) {
                visitCounts[x][y] += dfs(newX, newY);
            }
        }
        return visitCounts[x][y];
    }

    private static boolean canMove(int x, int y, int newX, int newY) {
        return roads[x][y] > roads[newX][newY];
    }

    private static boolean isInRange(int newX, int newY) {
        return 0 <= newX && newX < M && 0 <= newY && newY < N;
    }

    private static boolean alreadyVisited(int x, int y) {
        return visitCounts[x][y] != NOT_VISITED;
    }

    private static boolean arrivedAtDest(int x, int y) {
        return x == M - 1 && y == N - 1;
    }
}

