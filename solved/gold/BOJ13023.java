import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ13023 {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0];
		int M = inputNM[1];
		visited = new boolean[N];
		graph = new ArrayList[N];

		for (int i = 0; i < N; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int a = inputAB[0];
			int b = inputAB[1];

			graph[a].add(b);
			graph[b].add(a);
		}

		result = 0;
		for (int i = 0; i < N; i++) {
			dfs(i, 4);
			if (result == 1) break;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	static void dfs(int num, int depth) {
		if (depth == 0) {
			result = 1;
			return;
		}

		visited[num] = true;

		for (int one : graph[num]) {
//			System.out.println(one);
			if (!visited[one]) dfs(one, depth - 1);
		}
		visited[num] = false;
//		System.out.println(false);
	}
}
