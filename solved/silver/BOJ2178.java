import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2178 {

	static char[][] maze;
	static boolean[][] visited;
	static int[] moveX = {-1, 1, 0, 0};
	static int[] moveY = {0, 0, -1, 1};
	static int N, M;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNM[0];
		M = inputNM[1];

		maze = new char[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			char[] inputLine = br.readLine().toCharArray();
			maze[i] = Arrays.copyOf(inputLine, inputLine.length);
		}

//		System.out.println(Arrays.deepToString(maze));
		bfs();
	}

	static void bfs() throws IOException {
		Queue<OneMaze> queue = new LinkedList<>();
		queue.add(new OneMaze(0, 0, 1));
		visited[0][0] = true;
		int flag = 0;
		while (!queue.isEmpty()) {
			OneMaze polledOneMaze = queue.poll();

			for (int i = 0; i < 4; i++) {
				int mX = polledOneMaze.x + moveX[i];
				int mY = polledOneMaze.y + moveY[i];
				int curCount = polledOneMaze.count;
				if (0 <= mX && mX < N && 0 <= mY && mY < M && !visited[mX][mY] && maze[mX][mY] == '1') {
					if (mX == N - 1 && mY == M - 1) {
						bw.write(curCount + 1 + "\n");
						bw.flush();
						bw.close();
						flag = 1;
						break;
					}
					queue.add(new OneMaze(mX, mY, curCount + 1));
					visited[mX][mY] = true;
				}
				if (flag == 1) break;
			}
		}
	}

	static class OneMaze {
		int x;
		int y;
		int count;

		public OneMaze(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}

}
