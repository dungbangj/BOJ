import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11365 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		while (true) {
			String input = br.readLine();
			if (input.equals("END")) {
				break;
			}
			char[] inputChar = input.toCharArray();
			for (int i = inputChar.length - 1; i >= 0; i--) {
				sb.append(inputChar[i]);
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
