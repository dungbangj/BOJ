import java.io.*;
import java.util.StringTokenizer;

public class BOJ10101 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		if (a == 60 && b == 60 && c == 60) {
			sb.append("Equilateral");
		} else if (a + b + c == 180 && (a == b || b == c || c == a)) {
			sb.append("Isosceles");
		} else if (a + b + c == 180 && (a != b || b != c)) {
			sb.append("Scalene");
		} else if (a + b + c != 180) {
			sb.append("Error");
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
