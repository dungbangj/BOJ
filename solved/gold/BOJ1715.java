import java.io.*;
import java.util.*;

public class BOJ1715 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Long> queue = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			queue.add(Long.parseLong(br.readLine()));
		}

		long sum = 0;
		while (queue.size() > 1) {
			long polledNum1 = queue.poll();
			long polledNum2 = queue.poll();

			sum += polledNum1 + polledNum2;
			queue.add(polledNum1 + polledNum2);
//			System.out.println("sum = " + sum);
//			System.out.println("queue = " + queue);
		}

		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
}
