import java.io.*;
import java.util.StringTokenizer;

public class BOJ18698 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			int count = 0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == 'U') {
					count++;
				} else {
					break;
				}
			}
			sb.append(count).append("\n");
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
