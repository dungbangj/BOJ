import java.io.*;
import java.util.*;

public class BOJ1260 {

	static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		int[] inputNMV = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNMV[0];
		int M = inputNMV[1];
		int V = inputNMV[2];

		for (int i = 0; i <= N; i++) {
			arrayList.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int A = inputAB[0];
			int B = inputAB[1];

			arrayList.get(A).add(B);
			arrayList.get(B).add(A);
		}

		for (int i = 0; i <= N; i++) {
			arrayList.get(i).sort(Comparator.naturalOrder());
		}

//		System.out.println(arrayList);

		visited = new boolean[N + 1];
		DFS(V);
		bw.newLine();

		visited = new boolean[N + 1];
		BFS(V);
		bw.flush();
		bw.close();
	}

	static void DFS(int V) throws IOException {
		if (visited[V]) {
			return;
		}

		visited[V] = true;
		bw.write(V + " ");

		for (int i = 0; i < arrayList.get(V).size(); i++) {
			DFS(arrayList.get(V).get(i));
		}
	}

	static void BFS(int V) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(V);
		visited[V] = true;
		bw.write(V + " ");

		while (!queue.isEmpty()) {
			int poppedNum = queue.poll();

			ArrayList<Integer> arrBFS = arrayList.get(poppedNum);

			for (int num : arrBFS) {
				if (!visited[num]) {
					queue.add(num);
					bw.write(num + " ");
					visited[num] = true;
				}
			}
		}
	}
}
