import java.io.*;
import java.util.StringTokenizer;

public class BOJ17362 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());

		if (n % 8 == 1) {
			sb.append(1);
		} else if (n % 8 == 3 || n % 8 == 7) {
			sb.append(3);
		} else if (n % 8 == 5) {
			sb.append(5);
		} else if (n % 8 == 6 || n % 8 == 4) {
			sb.append(4);
		} else {
			sb.append(2);
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
