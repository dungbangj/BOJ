import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formattable;

public class BOJ11724 {
	static ArrayList<Integer>[] arrayLists;
	static boolean[] visited;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0];
		int M = inputNM[1];

		count = 0;
		arrayLists = new ArrayList[N + 1];
		visited = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			arrayLists[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			int[] inputUV = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int u = inputUV[0];
			int v = inputUV[1];

			arrayLists[u].add(v);
			arrayLists[v].add(u);
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	static void dfs(int start) {
		if (visited[start]) return;

		visited[start] = true;

		for (int num : arrayLists[start]) {
			dfs(num);
		}
	}
}
