import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ11286 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int count = 0;

		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int abs = Integer.compare(Math.abs(o1), Math.abs(o2));
				return abs != 0 ? abs : Integer.compare(o1, o2);
			}
		};
		PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);

		for (int i = 0; i < N; i++) {
			int inputNum = Integer.parseInt(br.readLine());

			if (inputNum != 0) {
				queue.add(inputNum);
			} else {
				if (!queue.isEmpty()) {
					bw.write(queue.poll() + "\n");
				} else {
					bw.write("0\n");
				}
			}
//			System.out.println(queue);
		}

//		System.out.println();
		bw.flush();
		bw.close();
	}
}
