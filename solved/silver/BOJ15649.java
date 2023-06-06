import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ15649 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;
	static int[] array;
	static int N, M;

	public static void main(String[] args) throws IOException {

		String[] firstInput = br.readLine().split(" ");

		N = Integer.parseInt(firstInput[0]);
		M = Integer.parseInt(firstInput[1]);
		array = new int[N];
		visited = new boolean[N];


		dfs(array, 0);


		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

	private static void dfs(int[] arr,  int depth) {

		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(arr, depth + 1);
				visited[i] = false;
			}
		}
	}
}
