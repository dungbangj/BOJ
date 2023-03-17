import java.io.*;
import java.util.StringTokenizer;

public class BOJ18409 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'i' || c == 'e' || c == 'o' || c == 'a' || c == 'u') {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
