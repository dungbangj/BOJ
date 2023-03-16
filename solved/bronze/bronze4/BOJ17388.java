import java.io.*;
import java.util.StringTokenizer;

public class BOJ17388 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		if (s + k + h >= 100) {
			sb.append("OK");
		} else {
			int min = Math.min(Math.min(s, k), h);
			if (min == s) {
				sb.append("Soongsil");
			} else if (min == k) {
				sb.append("Korea");
			} else {
				sb.append("Hanyang");
			}
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
