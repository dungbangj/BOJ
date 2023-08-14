import java.io.*;
import java.util.*;

public class BOJ1707 {

	static ArrayList<ArrayList<Integer>> arrayList;
	static int[] visited;
	static int noFlag;
	static int result;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testNum = Integer.parseInt(br.readLine());
		for (int i = 0; i < testNum; i++) {
			int[] inputVE = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int nodeNum = inputVE[0];
			int lineNum = inputVE[1];
			noFlag = 0;
			
			arrayList = new ArrayList<>();

			for (int j = 0; j <= nodeNum; j++) {
				arrayList.add(new ArrayList<>());
			}

			for (int j = 0; j < lineNum; j++) {
				int[] inputNode = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				int ANode = inputNode[0];
				int BNode = inputNode[1];

				arrayList.get(ANode).add(BNode);
				arrayList.get(BNode).add(ANode);
			}

			visited = new int[nodeNum + 1];

			for (int j = 1; j <= nodeNum; j++) {
				if (isNotVisited(j)) {
					dfs(j, 1);
				}
			}

			if (isNo()) {
				bw.write("NO\n");
			} else {
				bw.write("YES\n");
			}
		}
		bw.flush();
		bw.close();
	}

	private static void dfs(int node, int color) {
		if (isVisited(node) || isNo()) {
			return;
		}
		visited[node] = color;

		for (int polledNode : arrayList.get(node)) {
			if (isSameColor(node, polledNode)) {
				noFlag = 1;
				return;
			}
			if (isNotVisited(polledNode)) {
				dfs(polledNode, -1 * color);
			}
		}
	}

	private static boolean isNo() {
		return noFlag == 1;
	}

	private static boolean isVisited(int node) {
		return visited[node] != 0;
	}

	private static boolean isNotVisited(int polledNode) {
		return visited[polledNode] == 0;
	}

	private static boolean isSameColor(int node, int polledNode) {
		return visited[node] == visited[polledNode];
	}
}
