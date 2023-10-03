import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ1167 {
	static ArrayList<Node>[] graph;
	static int maxNode;
	static int maxDistance;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int V = Integer.parseInt(br.readLine());
		graph = new ArrayList[V + 1];

		for (int i = 0; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 1; i <= V; i++) {
			int[] inputNum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int idx = 0;
			int node = inputNum[idx++];

			do {
				graph[node].add(new Node(inputNum[idx], inputNum[idx + 1]));
				idx += 2;
			} while (idx < inputNum.length && inputNum[idx] != -1);
		}

		visited = new boolean[V + 1];
		dfs(1, 0);
		visited = new boolean[V + 1];
		dfs(maxNode, 0);
//		System.out.println(Arrays.toString(graph));
		bw.write(maxDistance + "\n");
		bw.flush();
		bw.close();
	}

	static void dfs(int start, int distance) {
		if (distance > maxDistance) {
			maxDistance = distance;
			maxNode = start;
		}

		visited[start] = true;

		for (Node node : graph[start]) {
			if (!visited[node.num]) dfs(node.num, distance + node.distance);
		}
	}

	static class Node {
		int num;
		int distance;

		public Node(int num, int distance) {
			this.num = num;
			this.distance = distance;
		}
	}
}
