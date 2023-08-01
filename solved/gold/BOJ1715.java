import java.io.*;
import java.util.*;

public class BOJ1715 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Long> priorityQueue = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			priorityQueue.add(Long.parseLong(br.readLine()));
		}

		long sum = 0;
		while (priorityQueue.size() > 1) {
			long polledNum1 = priorityQueue.poll();
			long polledNum2 = priorityQueue.poll();

			sum += polledNum1 + polledNum2;
			priorityQueue.add(polledNum1 + polledNum2);

		}

		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
}
