import java.io.*;
import java.util.*;

public class BOJ2178 {

	static final int WALL = 0;

	static int[][] maze;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		N = inputNM[0];
		M = inputNM[1];

		maze = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			char[] oneMazeLine = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				maze[i][j] = oneMazeLine[j] - '0';
			}
		}

//		for (int i = 0; i < N; i++) {
//			System.out.println(Arrays.toString(maze[i]));
//		}

		bfs();
		bw.write(maze[N - 1][M - 1] + "\n");
		bw.flush();
		bw.close();
	}

	private static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{0, 0});

		while (!queue.isEmpty()) {
			int[] polledNums = queue.poll();
			int polledX = polledNums[0];
			int polledY = polledNums[1];

			for (int i = 0; i < 4; i++) {
				int newX = polledX + dx[i];
				int newY = polledY + dy[i];

				if (0 <= newX && newX < N && 0 <= newY && newY < M) {
					if (!visited[newX][newY] && maze[newX][newY] != WALL) {
						queue.add(new int[]{newX, newY});
						maze[newX][newY] = maze[polledX][polledY] + 1;
						visited[newX][newY] = true;
					}
				}
			}
		}
	}
}
