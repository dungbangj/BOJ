import java.io.*;
import java.util.*;

public class BOJ14889 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, Sij, Sji;
	static int[][] scoreArr;
	static boolean[] visited;
	static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		scoreArr = new int[N][N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				scoreArr[i][j] = Integer.parseInt(input[j]);
			}
		}
		dfs(0, 0);
		bw.write(MIN + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int idx, int depth) {

		if (depth == N / 2) {
			diff();
			return;
		}
		for (int i = idx; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(idx + 1, depth + 1);
				visited[i] = false;
			}
		}
	}

	private static void diff() {
		int team_start = 0;
		int team_link = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visited[i] && visited[j]) {
					team_start += (scoreArr[i][j] + scoreArr[j][i]);
				} else if (!visited[i] && !visited[j]) {
					team_link += (scoreArr[i][j] + scoreArr[j][i]);
				}
			}
		}

		int diff = Math.abs(team_start - team_link);

		if (diff == 0) {
			System.out.println(0);
			System.exit(0);
		}
		MIN = Math.min(diff, MIN);
	}
}
