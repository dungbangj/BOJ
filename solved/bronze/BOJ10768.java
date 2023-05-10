import java.io.*;
import java.util.StringTokenizer;

public class BOJ10768 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int month = Integer.parseInt(br.readLine());
		int day = Integer.parseInt(br.readLine());

		if (month == 2 && day == 18) {
			sb.append("Special");
		} else if ((month == 2 && day < 18) || (month == 1)) {
			sb.append("Before");
		} else {
			sb.append("After");
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
