import java.io.*;
import java.util.*;

public class BOJ1021 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		LinkedList<Integer> circleQueue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			circleQueue.add(i);
		}

		int count = 0;
		input = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			int removeNum = Integer.parseInt(input[i]);
			int curPos = getPosition(circleQueue, removeNum);

			int clockwise = curPos;
			int counterclockwise = circleQueue.size() - curPos;

			int rotation;
			if (clockwise <= counterclockwise) {
				rotation = clockwise;
			} else {
				rotation = -counterclockwise;
			}

			rotate(circleQueue, rotation);
			count += Math.abs(rotation);

			circleQueue.removeFirst();
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static int getPosition(LinkedList<Integer> queue, int num) {
		for (int i = 0; i < queue.size(); i++) {
			if (queue.get(i) == num) {
				return i;
			}
		}
		return -1;
	}

	private static void rotate(LinkedList<Integer> queue, int steps) {
		if (steps > 0) {
			for (int i = 0; i < steps; i++) {
				int element = queue.removeFirst();
				queue.addLast(element);
			}
		} else {
			for (int i = 0; i < Math.abs(steps); i++) {
				int element = queue.removeLast();
				queue.addFirst(element);
			}
		}
	}
}
