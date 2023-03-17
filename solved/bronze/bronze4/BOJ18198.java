import java.io.*;
import java.util.StringTokenizer;

public class BOJ18198 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		int sumA = 0;
		int sumB = 0;

		for (int i = 0; i < input.length(); i += 2) {
			if (input.charAt(i) == 'A') {
				sumA += input.charAt(i + 1) - '0';
			} else {
				sumB += input.charAt(i + 1) - '0';
			}
		}
		if (sumA > sumB) {
			sb.append("A");
		} else {
			sb.append("B");
		}
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
