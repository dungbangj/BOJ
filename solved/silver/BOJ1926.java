import java.io.*;
import java.util.*;

public class BOJ1926 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int[] moveX = {-1, 0, 0, 1};
	static int[] moveY = {0, -1, 1, 0};
	static int count = 0;
	static boolean[][] visited;
	static int[][] map;
	static int row, col;

	public static void main(String[] args) throws IOException {
		String[] inputs = br.readLine().split(" ");
		row = Integer.parseInt(inputs[0]);
		col = Integer.parseInt(inputs[1]);

		map = new int[row][col];
		visited = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			String[] oneLine = br.readLine().split(" ");
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(oneLine[j]);
			}
		}

		int maxCount = 0;
		int paintCount = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					count = 0;
					dfs(i, j);
					if (count > maxCount) {
						maxCount = count;
					}
					paintCount++;
				}
			}
		}
		bw.write(paintCount + "\n" + maxCount + "\n");
		bw.flush();
		bw.close();
	}

	private static void dfs(int i, int j) {
		count++;
		map[i][j] = 0;
		visited[i][j] = true;

		for (int k = 0; k < 4; k++) {
			int newMoveX = i + moveX[k];
			int newMoveY = j + moveY[k];


			if (0 <= newMoveX && newMoveX < row && 0 <= newMoveY && newMoveY < col) {
				if (map[newMoveX][newMoveY] == 1 && !visited[newMoveX][newMoveY]) {
					dfs(newMoveX, newMoveY);
				}
			}
		}
	}
}
