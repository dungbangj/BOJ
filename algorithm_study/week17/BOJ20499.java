import java.io.*;
import java.util.StringTokenizer;

public class BOJ20499 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		String[] split = input.split("/");

		int K = Integer.parseInt(split[0]);
		int D = Integer.parseInt(split[1]);
		int A = Integer.parseInt(split[2]);
		if (K + A < D || D == 0) {
			sb.append("hasu");
		} else {
			sb.append("gosu");
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
