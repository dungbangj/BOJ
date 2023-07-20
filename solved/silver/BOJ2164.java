import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int flag = 1;
		int num = 1;
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}

		bw.write(queue.poll() + "\n");
		bw.flush();
		bw.close();
	}
}