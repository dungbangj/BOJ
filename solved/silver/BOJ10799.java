import java.io.*;
import java.util.*;

public class BOJ10799 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		char[] input = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == '(') {
				stack.push(input[i]);
			} else {
				stack.pop();
				if (input[i - 1] == '(') {
					count += stack.size();
				} else {
					count++;
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
