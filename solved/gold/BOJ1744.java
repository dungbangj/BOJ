import java.io.*;
import java.util.*;

public class BOJ1744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> plusPQ = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> minusPQ = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int inputNum = Integer.parseInt(br.readLine());
			if (inputNum > 0) {
				plusPQ.add(inputNum);
			} else {
				minusPQ.add(inputNum);
			}
		}

		int result = getSum(minusPQ, getSum(plusPQ, 0));

		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	private static int getSum(PriorityQueue<Integer> pq, int sum) {
		while (pq.size() > 0) {
			int polledNum = pq.poll();
			if (pq.size() >= 1 && polledNum != 1) {
				int nextPolledNum = pq.poll();
				if (nextPolledNum != 1) {
					sum += polledNum * nextPolledNum;
				} else {
					sum += polledNum + nextPolledNum;
				}
			} else {
				sum += polledNum;
			}
//			System.out.println("sum = " + sum);
		}
		return sum;
	}
}
