import java.io.*;
import java.util.StringTokenizer;

public class BOJ17009 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int sumA = 0;
		for (int i = 0; i < 3; i++) {
			sumA += Integer.parseInt(br.readLine()) * (3 - i);
		}

		int sumB = 0;
		for (int i = 0; i < 3; i++) {
			sumB += Integer.parseInt(br.readLine()) * (3 - i);
		}
		if (sumA > sumB) {
			sb.append("A");
		} else if (sumA < sumB) {
			sb.append("B");
		} else {
			sb.append("T");
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
