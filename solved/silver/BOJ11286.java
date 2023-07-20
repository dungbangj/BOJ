import java.io.*;
import java.util.*;

public class BOJ11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Comparator<Integer> customComp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int absComp = Integer.compare(Math.abs(o1), Math.abs(o2));
				return absComp != 0 ? absComp : Integer.compare(o1, o2);
			}
		};

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(customComp);

		for (int i = 0; i < N; ++i) {
			int inputNum = Integer.parseInt(br.readLine());
			if (inputNum != 0) {
				priorityQueue.add(inputNum);
			} else {
				if (priorityQueue.size() == 0) {
					bw.write(0 + "\n");
				} else {
					Integer polledNum = priorityQueue.poll();
					bw.write(polledNum + "\n");
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
