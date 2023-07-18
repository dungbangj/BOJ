import java.io.*;
import java.util.*;

public class BOJ17298 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] result = new int[N];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && inputArr[stack.peek()] < inputArr[i]) {
				result[stack.pop()] = inputArr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		for (int num : result) bw.write(num + " ");
		bw.flush();
		bw.close();
	}
}
