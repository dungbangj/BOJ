import java.io.*;
import java.util.StringTokenizer;

public class BOJ10808 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		String S = br.readLine();
		char[] sChar = S.toCharArray();
		int[] alpha = new int[26];
		for (char c : sChar) {
			alpha[c - 97]++;
		}
		for (int j : alpha) {
			sb.append(j).append(" ");
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
