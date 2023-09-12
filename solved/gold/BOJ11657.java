import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ11657 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<City>> cities = new ArrayList<>();
	static long[] dist;
	static int[] inputNM;

	public static void main(String[] args) throws IOException {
		inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		dist = new long[inputNM[0] + 1];

		Arrays.fill(dist, Long.MAX_VALUE);
		for (int i = 0; i <= inputNM[0]; i++) {
			cities.add(new ArrayList<>());
		}

		for (int i = 0; i < inputNM[1]; i++) {
			int[] inputABC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			cities.get(inputABC[0]).add(new City(inputABC[1], inputABC[2]));
		}

		if (bellmanFord()) bw.write("-1\n");
		else {
			for (int i = 2; i <= inputNM[0]; i++) {
				if (dist[i] == Long.MAX_VALUE) bw.write("-1\n");
				else bw.write(dist[i] + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

	static boolean bellmanFord() {
		dist[1] = 0;
		boolean update = false;

		for (int i = 0; i < inputNM[0] - 1; i++) {
			update = false;

			for (int j = 1; j <= inputNM[0]; j++) {
				for (City city : cities.get(j)) {
					if (dist[j] == Long.MAX_VALUE) break;
					if (dist[city.dest] > dist[j] + city.time) {
						dist[city.dest] = dist[j] + city.time;
						update = true;
					}
				}
			}

			if (!update) break;
		}

		if (update) {
			for (int i = 1; i <= inputNM[0]; i++) {
				for (City city : cities.get(i)) {
					if (dist[i] == Long.MAX_VALUE) break;
					if (dist[city.dest] > dist[i] + city.time) return true;
				}
			}
		}
		return false;
	}

	static class City {
		int dest;
		int time;

		public City(int dest, int time) {
			this.dest = dest;
			this.time = time;
		}

		@Override
		public String toString() {
			return "dest = " + dest + ", time = " + time + "\n";
		}
	}

}
