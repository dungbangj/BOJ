import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BOJ1916 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, M;
	static ArrayList<ArrayList<City>> cities = new ArrayList<>();
	static int[] dist;

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		dist = new int[N + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);

		for (int i = 0; i <= N; i++) {
			cities.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int[] inputABC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			cities.get(inputABC[0]).add(new City(inputABC[1], inputABC[2]));
		}

		int[] inputST = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		dijkstra(inputST[0]);

//		System.out.println("cities = " + cities);
//		System.out.println(Arrays.toString(dist));

		bw.write(dist[inputST[1]] + "\n");
		bw.flush();
		bw.close();
	}

	static void dijkstra(int start) {
		PriorityQueue<City> queue = new PriorityQueue<>();
		boolean[] visited = new boolean[N + 1];
		queue.add(new City(start, 0));
		dist[start] = 0;

		while (!queue.isEmpty()) {
			City polledCity = queue.poll();
			int polledCityDest = polledCity.dest;

			if (!visited[polledCityDest]) {
				visited[polledCityDest] = true;

				for (City city : cities.get(polledCityDest)) {
					if (!visited[city.dest] && dist[city.dest] > dist[polledCityDest] + city.cost) {
						dist[city.dest] = dist[polledCityDest] + city.cost;
						queue.add(new City(city.dest, dist[city.dest]));
					}
				}
			}
		}
	}

	static class City implements Comparable<City>{
		int dest;
		int cost;

		public City(int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}

		@Override
		public int compareTo(City o) {
			return cost - o.cost;
		}

		@Override
		public String toString() {
			return "dest = " + dest + ", cost = " + cost + "\n";
		}
	}

}
