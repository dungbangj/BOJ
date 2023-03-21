import java.io.*;
import java.util.StringTokenizer;

public class BOJ25628 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int bread = Integer.parseInt(st.nextToken());
		int meat = Integer.parseInt(st.nextToken());

		int b = bread / 2;
		int result = Math.min(b, meat);
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
