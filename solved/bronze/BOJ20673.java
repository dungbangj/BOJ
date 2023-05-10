import java.io.*;
import java.util.StringTokenizer;

public class BOJ20673 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		if (first <= 50 && second <= 10) {
			sb.append("White");
		} else if (second > 30) {
			sb.append("Red");
		} else {
			sb.append("Yellow");
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
