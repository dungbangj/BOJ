import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11945 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		for (int i = 0; i < row; i++) {
			String input = br.readLine();
			for (int j = input.length() - 1; j >= 0; j--) {
				sb.append(input.charAt(j));
			}
			sb.append("\n");
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
