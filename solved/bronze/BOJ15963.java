import java.io.*;
import java.util.StringTokenizer;

public class BOJ15963 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		long one = Long.parseLong(st.nextToken());
		long two = Long.parseLong(st.nextToken());

		if (one == two) {
			sb.append(1);
		} else {
			sb.append(0);
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
