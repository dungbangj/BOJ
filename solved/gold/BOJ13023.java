import java.io.*;
import java.util.*;

public class BOJ13023 {

	static int N, M;
	static ArrayList<ArrayList<Integer>> conns;
	static boolean[] visited;
	static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNM[0];
		M = inputNM[1];

		conns = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			conns.add(new ArrayList<>());
		}
		result = 0;
		for (int i = 0; i < M; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int A = inputAB[0];
			int B = inputAB[1];

			conns.get(A).add(B);
			conns.get(B).add(A);
		}

//		System.out.println(conns);
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			if (result == 0) {
				dfs(i, 1);
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	private static void dfs(int num, int depth) {
		if (depth == 5) {
			result = 1;
			return;
		}

		visited[num] = true;
		ArrayList<Integer> oneConn = conns.get(num);

		for (int neighbor : oneConn) {
			if (!visited[neighbor]) {
//				System.out.println(neighbor);
//				System.out.println(Arrays.toString(visited));
				dfs(neighbor, depth + 1);
//				break;
			}
		}
		visited[num] = false;
	}
}
