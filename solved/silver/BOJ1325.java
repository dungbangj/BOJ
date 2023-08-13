import java.io.*;
import java.util.*;

public class BOJ1325 {

	static Set<Integer> haveParents = new HashSet<>();
	static int[] countResult;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0];
		int M = inputNM[1];

		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

		for (int i = 0; i <= N; i++) {
			arrayList.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int A = inputAB[0];
			int B = inputAB[1];

			arrayList.get(A).add(B);
			haveParents.add(A);
		}

		int maxCount = 0;
		countResult = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			if (haveParents.contains(i)) {
				bfs(i, N, arrayList);
			}
		}

		for (int i = 1; i <= N; i++) {
			maxCount = Math.max(maxCount, countResult[i]);
		}

		for (int i = 1; i <= N; i++) {
			if (countResult[i] == maxCount) {
				bw.write(i + " ");
			}
		}
//		System.out.println(maxCount);
//		System.out.println(Arrays.toString(countResult));
//		System.out.println("arrayList = " + arrayList);
//		System.out.println("maxCount = " + maxCount);
		bw.newLine();
		bw.flush();
		bw.close();
	}

	private static void bfs(int start, int N, ArrayList<ArrayList<Integer>> arrayList) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N + 1];
		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int polledNum = queue.poll();
			for (int node : arrayList.get(polledNum)) {
				if (!visited[node]) {
					visited[node] = true;
					queue.add(node);
					countResult[node]++;
				}
			}
		}
	}

}
