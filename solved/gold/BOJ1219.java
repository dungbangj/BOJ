import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1219 {
	static final long MIN = Long.MIN_VALUE;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, S, T, M;
	static ArrayList<ArrayList<City>> cities = new ArrayList<>();
	static int[] earnMoney;
	static long[] totalEarn;
	static boolean update;

	public static void main(String[] args) throws IOException {
		int[] inputNSTM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNSTM[0];
		S = inputNSTM[1];
		T = inputNSTM[2];
		M = inputNSTM[3];

		for (int i = 0; i < N; i++) {
			cities.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int[] inputSTM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int start = inputSTM[0];
			int target = inputSTM[1];
			int money = inputSTM[2];

			cities.get(start).add(new City(target, money));
		}

//		System.out.println("\ncities = " + cities);

		earnMoney = new int[N];
		int[] inputMoney = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		if (N >= 0) System.arraycopy(inputMoney, 0, earnMoney, 0, N);

		totalEarn = new long[N];
		if (!bfs(S, T)) bw.write("gg\n");
		else {
			update = false;
			bellmanFordOrigin(S);
			if (bellmanFordCycle(S, T)) bw.write("Gee\n");
			else bw.write(totalEarn[T] + "\n");
		}
		bw.flush();
		bw.close();
	}

	static boolean bfs(int start, int target) {
		if (start == target) return true;

		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N];
		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int polledCity = queue.poll();

			for (City city : cities.get(polledCity)) {
				if (!visited[city.dest]) {
					if (city.dest == target) return true;
					visited[city.dest] = true;
					queue.add(city.dest);
				}
			}
		}
		return false;
	}

	static boolean bellmanFordOrigin(int start) {
		Arrays.fill(totalEarn, MIN);
		totalEarn[start] = earnMoney[start];

		for (int i = 0; i < N - 1; i++) {
			update = false;

			for (int j = 0; j < N; j++) {
				for (City city : cities.get(j)) {
					if (totalEarn[j] == MIN) break;
					if (totalEarn[city.dest] < totalEarn[j] - city.money + earnMoney[city.dest]) {
						totalEarn[city.dest] = totalEarn[j] - city.money + earnMoney[city.dest];
						update = true;
					}
				}
			}

			if (!update) break;
		}
		return false;
	}

	static boolean bellmanFordCycle(int start, int target) {

		ArrayList<Integer> cycleCities = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (City city : cities.get(i)) {
				if (totalEarn[i] == MIN) break;
				if (totalEarn[city.dest] < totalEarn[i] - city.money + earnMoney[city.dest]) {
					cycleCities.add(i);
					cycleCities.add(city.dest);
				}
			}
		}

		for (Integer cycleCity : cycleCities) {
			if (bfs(cycleCity, target)) return true;
		}

		Arrays.fill(totalEarn, MIN);
		totalEarn[start] = earnMoney[start];

		for (int i = 0; i < N - 1; i++) {
			update = false;
			for (int j = 0; j < N; j++) {
				for (City city : cities.get(j)) {
					if (cycleCities.contains(j) || totalEarn[j] == MIN) break;
					if (cycleCities.contains(city.dest) || totalEarn[city.dest] < totalEarn[j] - city.money + earnMoney[city.dest]) {
						totalEarn[city.dest] = totalEarn[j] - city.money + earnMoney[city.dest];
						update = true;
					}
				}
			}
			if (!update) break;
		}
		return false;
	}

	static class City {
		int dest;
		int money;

		public City(int dest, int money) {
			this.dest = dest;
			this.money = money;
		}

		@Override
		public String toString() {
			return "dest = " + dest + ", money = " + money + "\n";
		}
	}
}
