import java.io.*;
import java.util.StringTokenizer;

public class BOJ19602 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int S = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int L = Integer.parseInt(br.readLine());

		if (1 * S + 2 * M + 3 * L >= 10) {
			sb.append("happy");
		} else {
			sb.append("sad");
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
