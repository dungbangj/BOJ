import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2252 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] linked = new int[inputNM[0] + 1];

		for (int i = 0; i <= inputNM[0]; i++) {
			arrayList.add(new ArrayList<>());
		}

		for (int i = 0; i < inputNM[1]; i++) {
			int[] inputST = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			linked[inputST[1]]++;
			arrayList.get(inputST[0]).add(inputST[1]);
		}

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i < linked.length; i++) {
			if (linked[i] == 0) queue.add(i);
		}
//		System.out.println("queue = " + queue);
//		System.out.println("linked = " + Arrays.toString(linked));

		while (!queue.isEmpty()) {
			int polledNum = queue.poll();
			bw.write(polledNum + " ");

			for (int num : arrayList.get(polledNum)) {
				if (--linked[num] == 0) queue.add(num);
			}
		}

		bw.flush();
		bw.close();
	}
}
