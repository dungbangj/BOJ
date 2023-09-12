import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1219 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, S, T, M;
	static ArrayList<ArrayList<City>> cities = new ArrayList<>();
	static int[] addMoney;
	static long[] totalMoney;
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
			int S = inputSTM[0];
			int T = inputSTM[1];
			int M = inputSTM[2];

			cities.get(S).add(new City(T, M));
		}

		addMoney = new int[N];
		int[] inputMoney = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		if (N >= 0) System.arraycopy(inputMoney, 0, addMoney, 0, N);

		totalMoney = new long[N];
		if (!bfs(S, T)) bw.write("gg\n");
		else {
			update = false;
		}
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

	static boolean bellmanFordOrigin(int start, int target) {
		Arrays.fill(totalMoney, Long.MIN_VALUE);
		totalMoney[start] = addMoney[start];

		for (int i = 0; i < N - 1; i++) {
			update = false;

			for (int j = 0; j < N; j++) {
				for (City city : cities.get(j)) {
					if (totalMoney[j] == Integer.MIN_VALUE) break;
					if (totalMoney[city.dest] < totalMoney[j] + city.money + addMoney[city.dest]) {
						totalMoney[city.dest] = totalMoney[j] + city.money + addMoney[city.dest];
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
				if (totalMoney[i] == Integer.MIN_VALUE) break;
				if (totalMoney[city.dest] < totalMoney[i] + city.money + addMoney[city.dest]) {
					cycleCities.add(i);
					cycleCities.add(city.dest);
				}
			}
		}

		for (Integer cycleCity : cycleCities) {
			if (bfs(cycleCity, target)) return true;
		}
		Arrays.fill(totalMoney, Integer.MIN_VALUE);
		totalMoney[start] = addMoney[start];

		for (int i = 0; i < N - 1; i++) {
			update = false;
			for (int j = 0; j < N; j++) {

			}
		}
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
