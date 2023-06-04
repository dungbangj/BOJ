import java.io.*;
import java.util.Stack;

public class BOJ3986 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < N; i++) {
			char[] input = br.readLine().toCharArray();

			Stack<Character> ABStack = new Stack<>();

			ABStack.push(input[0]);
			for (int j = 1; j < input.length; j++) {
				if (ABStack.isEmpty()) {
					ABStack.push(input[j]);
				} else {
					if (ABStack.peek() == input[j]) {
						ABStack.pop();
					} else {
						ABStack.push(input[j]);
					}
				}
			}
			if (ABStack.isEmpty()) {
				count++;
			}
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
