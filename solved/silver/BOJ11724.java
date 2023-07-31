import java.io.*;
import java.util.*;

public class BOJ11724 {
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> conns;
	static ArrayList<Set<Integer>> ans;
	static int N, M;
	static int index;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNM[0];
		M = inputNM[1];

		conns = new ArrayList<>();
		visited = new boolean[N + 1];

		for (int i = 0; i <= N; i++) {
			conns.add(new ArrayList<>());
		}

		ans = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int[] inputUV = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int u = inputUV[0];
			int v = inputUV[1];

			conns.get(u).add(v);
			conns.get(v).add(u);
		}
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				ans.add(new HashSet<>());
				dfs(i);
				index++;
			}
		}

//		System.out.println(ans);
		bw.write(ans.size() + "\n");
		bw.flush();
		bw.close();
	}

	private static void dfs(int num) {
//		System.out.println(num);
		visited[num] = true;
		ArrayList<Integer> numArr = conns.get(num);

		ans.get(index).add(num);
		if (isAllVisited(numArr) && numArr.size() != 1) {
			return;
		}

		for (Integer integer : numArr) {
			if (!visited[integer]) {
				dfs(integer);
//				visited[num] = true;
			}
		}
	}

	private static boolean isAllVisited(ArrayList<Integer> arrayList) {
		for (Integer integer : arrayList) {
			if (!visited[integer]) {
				return false;
			}
		}
		return true;
	}
}
