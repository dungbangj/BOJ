import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1516 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] indegree = new int[N + 1];
		int[] buildTimes = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			arrayList.add(new ArrayList<>());
		}

		for (int i = 0; i <= N; i++) {
			if (i == 0) continue;
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			buildTimes[i] = input[0];
			for (int j = 1; j < input.length; j++) {
				if (input[j] != -1) {
					arrayList.get(input[j]).add(i);
					indegree[i]++;
				}
			}
		}

//		System.out.println("arrayList = " + arrayList);

		Queue<Integer> queue = new LinkedList<>();

//		System.out.println("indegree = " + Arrays.toString(indegree));
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) queue.add(i);
		}

		int[] totalBuildTimes = new int[N + 1];
		while (!queue.isEmpty()) {
			int polledNum = queue.poll();
//			System.out.println("wow = " + arrayList.get(polledNum));
			for (int num : arrayList.get(polledNum)) {
				totalBuildTimes[num] = Math.max(totalBuildTimes[num], totalBuildTimes[polledNum] + buildTimes[polledNum]);
				if (--indegree[num] == 0) queue.add(num);
			}
		}

		for (int i = 1; i <= N; i++) {
			bw.write(totalBuildTimes[i] + buildTimes[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
