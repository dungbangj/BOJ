import java.io.*;
import java.util.*;

public class BOJ1976 {

	static int cities;
	static ArrayList<ArrayList<Integer>> cityConnects;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		cities = Integer.parseInt(br.readLine());
		int citiesToTravel = Integer.parseInt(br.readLine());
		cityConnects = new ArrayList<>();

		for (int i = 0; i <= cities; i++) {
			cityConnects.add(new ArrayList<>());
		}

		for (int i = 1; i <= cities; i++) {
			int[] inputConnection = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			inputConnection[i - 1] = 1;

			for (int j = 0; j < inputConnection.length; j++) {
				if (inputConnection[j] == 1) {
					cityConnects.get(i).add(j + 1);
					cityConnects.get(j + 1).add(i);
				}
			}
		}

//		System.out.println("cityConnects = " + cityConnects);
		int[] inputTravelOrder = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int NoFlag = 0;

		for (int i = 0; i < inputTravelOrder.length - 1; i++) {
			if (!bfs(inputTravelOrder[i], inputTravelOrder[i + 1])) {
				NoFlag = 1;
			}
		}

		String result = (NoFlag == 1) ? "NO\n" : "YES\n";
		bw.write(result);
		bw.flush();
		bw.close();
	}

	private static boolean bfs(int start, int destination) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[cities + 1];
		queue.add(start);

		while (!queue.isEmpty()) {
			int polledNum = queue.poll();
			visited[polledNum] = true;

			ArrayList<Integer> tmpArr = cityConnects.get(polledNum);
			for (int num : tmpArr) {
				if (num == destination) return true;
				if (!visited[num]) queue.add(num);
			}
		}
		return false;
	}
}
