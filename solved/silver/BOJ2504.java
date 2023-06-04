import java.io.*;
import java.util.*;

public class BOJ2504 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static char[] input;

	public static void main(String[] args) throws IOException {
		input = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		int mul = 1;
		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			switch (input[i]) {
				case '(':
					stack.push(input[i]);
					mul *= 2;
					break;
				case '[':
					stack.push(input[i]);
					mul *= 3;
					break;
				case ')':
					if (stack.isEmpty() || stack.peek() != '(') {
						System.out.println("0");
						System.exit(0);
					} else if (input[i - 1] == '(') {
						sum += mul;
					}
					stack.pop();
					mul /= 2;
					break;
				case ']':
					if (stack.isEmpty() || stack.peek() != '[') {
						System.out.println("0");
						System.exit(0);
					} else if (input[i - 1] == '[') {
						sum += mul;
					}
					stack.pop();
					mul /= 3;
					break;
			}
		}
		if (!stack.isEmpty()) {
			bw.write("0\n");
		} else {
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
