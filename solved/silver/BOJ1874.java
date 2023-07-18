import java.io.*;
import java.util.*;

public class BOJ1874 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int[] inputArr = new int[N];
		int[] nums = new int[N];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
			nums[i] = i + 1;
		}

		int inputArrIdx = 0;

		for (int i = 0; i < N; i++) {
			stack.push(nums[i]);
			sb.append("+\n");
			while (!stack.isEmpty() && stack.peek() == inputArr[inputArrIdx]) {
				sb.append("-\n");
				inputArrIdx++;
				stack.pop();
			}
		}

		if (!stack.isEmpty()) {
			bw.write("NO\n");
		} else {
			bw.write(sb.toString());
		}

		bw.flush();
		bw.close();
	}
}
