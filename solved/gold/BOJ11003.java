import java.io.*;
import java.util.*;

public class BOJ11003 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = input[0];
		int L = input[1];
		Deque<Node> deque = new LinkedList<>();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int inBox = Integer.parseInt(st.nextToken());
			while (!deque.isEmpty() && deque.getLast().value > inBox) {
				deque.removeLast();
			}
			deque.add(new Node(inBox, i));

			if (deque.getFirst().index <= i - L) {
				deque.removeFirst();
			}
			bw.write(deque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}
}

class Node {
	public int value;
	public int index;

	Node(int value, int index) {
		this.value = value;
		this.index = index;
	}
}
