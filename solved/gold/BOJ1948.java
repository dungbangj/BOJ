import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1948 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Town>> roads;
	static ArrayList<ArrayList<Town>> reverseRoads;
	static boolean[] visited;
	static int[] totalCost, indegree;
	static int count, n, m;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		indegree = new int[n + 1];
		roads = new ArrayList<>();
		reverseRoads = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			roads.add(new ArrayList<>());
			reverseRoads.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int[] inputInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int start = inputInfo[0];
			int dest = inputInfo[1];
			int time = inputInfo[2];

			roads.get(dest).add(new Town(start, time));
			reverseRoads.get(start).add(new Town(dest, time));
			indegree[start]++;
		}

		int[] inputResultST = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("indegree = " + Arrays.toString(indegree));
		Queue<Integer> queue = new LinkedList<>();
		visited = new boolean[n + 1];
		totalCost = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0) queue.add(i);
		}

		while (!queue.isEmpty()) {
			int polledNum = queue.poll();

			for (Town town : roads.get(polledNum)) {
				int start = town.start;
				int cost = town.cost;

				totalCost[start] = Math.max(totalCost[start], totalCost[polledNum] + cost);
				if (--indegree[start] == 0) queue.add(start);
			}
		}
		System.out.println("totalCost = " + Arrays.toString(totalCost));
		dfs(inputResultST[0]);
		int minCost = totalCost[inputResultST[0]];
		bw.write(minCost + "\n" + count);
		bw.flush();
		bw.close();
	}

	static void dfs(int start) {
		if (visited[start]) return;

		visited[start] = true;

		for (Town town : reverseRoads.get(start)) {
			int townStart = town.start;
			int townCost = town.cost;

			if (totalCost[start] == totalCost[townStart] + townCost) {
				count++;
				dfs(townStart);
			}
		}
	}

	static class Town {
		int start;
		int cost;

		public Town(int start, int cost) {
			this.start = start;
			this.cost = cost;
		}
	}
}
