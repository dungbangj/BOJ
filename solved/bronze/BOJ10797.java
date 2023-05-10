import java.io.*;
import java.util.StringTokenizer;

public class BOJ10797 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			if (Integer.parseInt(st.nextToken()) == num) {
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
