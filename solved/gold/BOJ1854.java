import java.io.*;
import java.util.*;

public class BOJ1854 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int n, m, k;
	static ArrayList<ArrayList<City>> cities = new ArrayList<>();
	static ArrayList<PriorityQueue<Integer>> dist;

	public static void main(String[] args) throws IOException {

		int[] inputnmk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		n = inputnmk[0];
		m = inputnmk[1];
		k = inputnmk[2];
		dist = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			cities.add(new ArrayList<>());
			dist.add(new PriorityQueue<>(Collections.reverseOrder()));
		}

		for (int i = 0; i < m; i++) {
			int[] inputabc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			cities.get(inputabc[0]).add(new City(inputabc[1], inputabc[2]));
		}

//		System.out.println(cities);
		dijkstra();

		for (int i = 1; i <= n; i++) {
			if (dist.get(i).size() == k) bw.write(dist.get(i).peek() + "\n");
			else bw.write("-1\n");
		}
		bw.flush();
		bw.close();
	}

	static void dijkstra() {
		int start = 1;
		PriorityQueue<City> queue = new PriorityQueue<>();
		queue.add(new City(start, 0));
		dist.get(start).add(0);

		while (!queue.isEmpty()) {
			City polledCity = queue.poll();
			int polledCityDest = polledCity.dest;
			int polledCityTime = polledCity.time;

			for (City city : cities.get(polledCityDest)) {
				int totalTime = polledCityTime + city.time;

				if (dist.get(city.dest).size() < k) {
					dist.get(city.dest).add(totalTime);
					queue.add(new City(city.dest, totalTime));
				} else if (dist.get(city.dest).peek() > totalTime) {
					dist.get(city.dest).poll();
					dist.get(city.dest).add(totalTime);

					queue.add(new City(city.dest, totalTime));
				}
			}
		}
	}

	static class City implements Comparable<City>{
		int dest;
		int time;

		public City(int dest, int time) {
			this.dest = dest;
			this.time = time;
		}


		@Override
		public int compareTo(City o) {
			return time - o.time;
		}

		@Override
		public String toString() {
			return "dest = " + dest + ", time = " + time + "\n";
		}
	}

}
