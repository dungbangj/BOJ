import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ15873 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		int len = input.length();
		int result = 0;
		int one = 0, two = 0;
		if (len == 2) {
			one = Integer.parseInt(String.valueOf(input.charAt(0)));
			two = Integer.parseInt(String.valueOf(input.charAt(1)));
		} else if (len == 3) {
			if (input.charAt(1) == '0') {
				one = Integer.parseInt(input.substring(0, 2));
				two = Integer.parseInt(String.valueOf(input.charAt(2)));
			} else {
				one = Integer.parseInt(String.valueOf(input.charAt(0)));
				two = Integer.parseInt(input.substring(1, 3));
			}
		} else if (len == 4) {
			one = Integer.parseInt(input.substring(0, 2));
			two = Integer.parseInt(input.substring(2, 4));
		}
		result = one + two;
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
