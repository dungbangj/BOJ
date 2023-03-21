import java.io.*;
import java.util.StringTokenizer;

public class BOJ18408 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int countOne = 0, countTwo = 0;
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 1) {
				countOne++;
			} else {
				countTwo++;
			}
		}
		if (countOne > countTwo) {
			sb.append(1);
		} else {
			sb.append(2);
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
