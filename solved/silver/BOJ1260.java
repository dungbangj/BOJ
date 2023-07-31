import java.io.*;
import java.util.*;

public class BOJ1260 {

	static int N, M, V;
	static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNMV = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		N = inputNMV[0];
		M = inputNMV[1];
		V = inputNMV[2];

		for (int i = 0; i <= N; i++) {
			arr.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int A = inputAB[0];
			int B = inputAB[1];

			arr.get(A).add(B);
			arr.get(B).add(A);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(arr.get(i));
		}

		visited = new boolean[N + 1];
		dfs(V, 1);
		sb.append("\n");

		visited = new boolean[N + 1];
		bfs(V);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static void dfs(int start, int depth) {
		sb.append(start).append(" ");
		visited[start] = true;

		ArrayList<Integer> oneArr = arr.get(start);

		for (int neighbour : oneArr) {
			if (!visited[neighbour]) {
				dfs(neighbour, depth + 1);
			}
		}
	}

	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		sb.append(start).append(" ");

		while (!queue.isEmpty()) {
			int polledNum = queue.poll();
			ArrayList<Integer> oneArr = arr.get(polledNum);

			for (int neighbour : oneArr) {
				if (!visited[neighbour]) {
					queue.add(neighbour);
					visited[neighbour] = true;
					sb.append(neighbour).append(" ");
				}
			}
		}
	}
}
