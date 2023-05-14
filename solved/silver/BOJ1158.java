import java.io.*;
import java.util.*;

public class BOJ1158 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String input = br.readLine();
		int size = Integer.parseInt(input.split(" ")[0]);
		int num = Integer.parseInt(input.split(" ")[1]);

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= size; i++) {
			queue.add(i);
		}

		bw.write("<");

		while (queue.size() != 0) {
			for (int i = 0; i < num - 1; i++) {
				queue.add(queue.poll());
			}

			bw.write(Integer.toString(queue.poll()));
			if (queue.size() != 0) {
				bw.write(", ");
			}
		}
		bw.write(">");
		bw.flush();
		bw.close();
	}
}
