import java.io.*;
import java.util.StringTokenizer;

public class BOJ18330 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int nextMonth = Integer.parseInt(br.readLine());
		int thisMonth = Integer.parseInt(br.readLine());
		int limit = 60 + thisMonth;
		int result;
		if (nextMonth <= limit) {
			result = nextMonth * 1500;
		} else {
			result = limit * 1500;
			nextMonth -= limit;
			result += nextMonth * 3000;
		}

		sb.append(result);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
