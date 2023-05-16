import java.io.*;
import java.util.*;

public class BOJ9012 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			Stack<Character> bracketStack = new Stack<>();
			char[] input = br.readLine().toCharArray();
			for (char bracket : input) {
				if (bracketStack.isEmpty()) {
					bracketStack.push(bracket);
				} else if (bracketStack.peek() == '(' && bracket == ')') {
					bracketStack.pop();
				} else {
					bracketStack.push(bracket);
				}
			}

			if (bracketStack.isEmpty()) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
