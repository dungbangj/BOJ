import java.io.*;
import java.util.*;

public class BOJ15663 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static Set<String> set = new LinkedHashSet<>();
	static int[] arr, ansArr;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		String[] input = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		arr = new int[N];
		ansArr = new int[N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}

		Arrays.sort(arr);

		dfs(0);

		for (String s : set) {
			bw.write(s);
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(ansArr[i]).append(" ");
			}
			sb.append("\n");
			set.add(sb.toString());
			sb = new StringBuilder();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				ansArr[depth] = arr[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
