import java.io.*;
import java.util.*;

public class BOJ15650 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		arr = new int[N];
		visited = new boolean[N];

		dfs(arr, 0);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int[] arr, int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				if (depth == 0) {
					dfsPart(arr, depth, i);
				} else if (arr[depth - 1] < i + 1) {
					dfsPart(arr, depth, i);
				}
			}
		}
	}

	private static void dfsPart(int[] arr, int depth, int i) {
		visited[i] = true;
		arr[depth] = i + 1;
		dfs(arr, depth + 1);
		visited[i] = false;
	}
}
