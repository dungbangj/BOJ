import java.io.*;
import java.util.*;

public class BOJ3015 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		int[] inputs = new int[N];
		Stack<Pair> stack = new Stack<>();
		long count = 0;

		for (int i = 0; i < N; i++) {
			inputs[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < N; i++) {

			Pair pair = new Pair(inputs[i], 1);

			while (!stack.isEmpty() && stack.peek().height <= inputs[i]) {
				Pair popped = stack.pop();
				count += popped.count;
				if (popped.height == inputs[i]) {
					pair.count += popped.count;
				}
			}

			if (!stack.isEmpty()) {
				count++;
			}

			stack.push(pair);
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}

class Pair {
	int height;
	int count;

	public Pair(int height, int count) {
		this.height = height;
		this.count = count;
	}
}
