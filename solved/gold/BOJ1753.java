import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BOJ1753 {
	static final int INF = 1_000_000;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Node>> nodes = new ArrayList<>();
	static int[] dist, inputVE;

	public static void main(String[] args) throws IOException {
		inputVE = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int K = Integer.parseInt(br.readLine());
		dist = new int[inputVE[0] + 1];
		Arrays.fill(dist, INF);

		for (int i = 0; i <= inputVE[0]; i++) {
			nodes.add(new ArrayList<>());
		}

//		System.out.println("\ninputVE = " + Arrays.toString(inputVE));
//		System.out.println("nodes = " + nodes);

		for (int i = 0; i < inputVE[1]; i++) {
			int[] inputuvw = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			nodes.get(inputuvw[0]).add(new Node(inputuvw[1], inputuvw[2]));
		}
//		System.out.println(nodes);

		dijkstra(K);

		for (int i = 1; i <= inputVE[0]; i++) {
			if (dist[i] == INF) bw.write("INF\n");
			else bw.write(dist[i] + "\n");
		}
		bw.flush();
		bw.close();
	}

	static void dijkstra(int start) {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		boolean[] visited = new boolean[inputVE[0] + 1];
		queue.add(new Node(start, 0));
		dist[start] = 0;

		while (!queue.isEmpty()) {
			Node polledNode = queue.poll();
			int polledNodeDest = polledNode.dest;

			if (visited[polledNodeDest]) continue;
			visited[polledNodeDest] = true;

			for (Node node : nodes.get(polledNodeDest)) {
				if (dist[node.dest] > dist[polledNodeDest] + node.weight) {
					dist[node.dest] = dist[polledNodeDest] + node.weight;
					queue.add(new Node(node.dest, dist[node.dest]));
				}
			}
		}
	}

	static class Node implements Comparable<Node> {
		int dest;
		int weight;

		public Node(int dest, int weight) {
			this.dest = dest;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return weight - o.weight;
		}

		@Override
		public String toString() {
			return "dest = " + dest + " , weigth = " + weight + "\n";
		}
	}
}
