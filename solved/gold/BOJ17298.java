package week;

import java.io.*;
import java.util.*;

public class BOJ17298 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}

		for (int i = 0; i < N; i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
		bw.close();
	}
}
