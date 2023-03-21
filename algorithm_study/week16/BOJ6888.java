import java.io.*;
import java.util.StringTokenizer;

public class BOJ6888 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		while (start <= end) {
			sb.append("All positions change in year ").append(start).append("\n");
			start += 60;
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
