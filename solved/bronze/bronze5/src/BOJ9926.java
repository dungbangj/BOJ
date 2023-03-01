import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ9926 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static int[] moveRow = {1, -1, 0, 0};
	static int[] moveCol = {0, 0, 1, -1};
	static int[][] arr;
	static int[] result;
	static int N, m;

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		result = new int[10];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0, new boolean[N][N], 0);

		sb.append(Arrays.toString(result));
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void dfs(int i, int j, boolean[][] visited, int sum) {
		if (i == N - 1 && j == N - 1) {
			result[m++] = sum + arr[i][j];
			return;
		}
		if (visited[i][j]) {
			return;
		}
		visited[i][j] = true;
		sum += arr[i][j];
		for (int k = 0; k < 4; k++) {
			int row = i + moveRow[k];
			int col = j + moveCol[k];
			if (row == -1 || row == N || col == -1 || col == N) {
				continue;
			}
			dfs(row, col, visited, sum);
		}
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
