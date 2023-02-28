import java.io.*;
import java.util.StringTokenizer;

public class BOJ10039 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input < 40) {
				input = 40;
			}
			sum += input;
		}
		sb.append(sum / 5);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
