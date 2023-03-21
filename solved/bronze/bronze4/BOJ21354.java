import java.io.*;
import java.util.StringTokenizer;

public class BOJ21354 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int apple = Integer.parseInt(st.nextToken());
		int pear = Integer.parseInt(st.nextToken());

		if (apple * 7 > pear * 13) {
			sb.append("Axel");
		} else if (apple * 7 < pear * 13) {
			sb.append("Petra");
		} else {
			sb.append("lika");
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
