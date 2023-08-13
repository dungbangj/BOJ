import javax.swing.text.Style;
import java.io.*;
import java.util.*;

public class BOJ18352 {

	static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
	static int N, M, K, X;
	static int[] shortestDistance;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNMKX = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNMKX[0];
		M = inputNMKX[1];
		K = inputNMKX[2];
		X = inputNMKX[3];

		shortestDistance = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			arrayList.add(new ArrayList<>());
			shortestDistance[i] = -1;
		}

		for (int i = 0; i < M; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int A = inputAB[0];
			int B = inputAB[1];

			arrayList.get(A).add(B);
		}

		bfs(X);
//		System.out.println("shortestDistance = " + Arrays.toString(shortestDistance));
		int flag = 0;

		for (int i = 1; i <= N; i++) {
			if (shortestDistance[i] == K) {
				bw.write(i + "\n");
				flag = 1;
			}
		}

		if (flag == 0) {
			bw.write("-1\n");
		}
		bw.flush();
		bw.close();
	}

	private static void bfs(int start) {
		shortestDistance[start] = 0;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);

		while (!queue.isEmpty()) {
			int polledNum = queue.poll();

			for (int node : arrayList.get(polledNum)) {
				if (shortestDistance[node] == -1) {
					shortestDistance[node] = shortestDistance[polledNum] + 1;
					queue.add(node);
				}
			}
		}
	}
}
