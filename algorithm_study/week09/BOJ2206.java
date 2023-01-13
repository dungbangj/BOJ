import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2206 {
    
    private static final int[] MOVE_X = {0, 0, -1, 1};
    private static final int[] MOVE_Y = {-1, 1, 0, 0};
    private static final int VISIT_SIGN = 9;

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N, M;
    private static int[][] graph;
    private static int[][] visited;

    static class OneFoot {
        int x;
        int y;
        int walkCount;
        int crashCount;

        public OneFoot(int x, int y, int walkCount, int crashCount) {
            this.x = x;
            this.y = y;
            this.walkCount = walkCount;
            this.crashCount = crashCount;
        }
    }

    public static void main(String[] args) throws IOException {

        initGraph();
        System.out.println(bfs());
    }

    private static void initGraph() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        graph = new int[N][M];
        visited = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            char[] oneLine = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                graph[i][j] = oneLine[j] - '0';
                visited[i][j] = VISIT_SIGN;
            }
        }
    }

    private static int bfs() {
        Queue<OneFoot> footQueue = new LinkedList<>();
        footQueue.add(new OneFoot(0, 0, 1, 0));
        visited[0][0] = 0;

        while (!footQueue.isEmpty()) {
            OneFoot oneFoot = footQueue.poll();
            
            if (isAtDestination(oneFoot))
                return oneFoot.walkCount;

            for (int i = 0; i < 4; i++) {
                int newX = oneFoot.x + MOVE_X[i];
                int newY = oneFoot.y + MOVE_Y[i];

                if (isInRange(newX, newY)) {
                    if (notVisited(oneFoot, newX, newY)) {
                        if (isNotWall(newX, newY)) {
                            footQueue.add(new OneFoot(newX, newY, oneFoot.walkCount + 1, oneFoot.crashCount));
                            visited[newY][newX] = oneFoot.crashCount;
                        } else {
                            if (notCrashedYet(oneFoot)) {
                                footQueue.add(new OneFoot(newX, newY, oneFoot.walkCount + 1, oneFoot.crashCount + 1));
                                visited[newY][newX] = 1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private static boolean notVisited(OneFoot oneFoot, int newX, int newY) {
        return visited[newY][newX] > oneFoot.crashCount;
    }

    private static boolean notCrashedYet(OneFoot oneFoot) {
        return oneFoot.crashCount == 0;
    }

    private static boolean isNotWall(int newX, int newY) {
        return graph[newY][newX] == 0;
    }

    private static boolean isAtDestination(OneFoot oneFoot) {
        return oneFoot.x == M - 1 && oneFoot.y == N - 1;
    }

    private static boolean isInRange(int newX, int newY) {
        return newX >= 0 && newX < M && newY >= 0 && newY < N;
    }
}
