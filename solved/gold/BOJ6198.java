package week;

import java.io.*;
import java.util.*;

public class BOJ6198 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		long result = 0;

		for (int i = 0; i < N; i++) {
			int h = Integer.parseInt(br.readLine());
			while (!stack.isEmpty() && stack.peek() <= h) {
				stack.pop();
			}
			stack.push(h);
			result += stack.size() - 1;
		}

		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
