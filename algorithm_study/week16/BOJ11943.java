import java.io.*;
import java.util.StringTokenizer;

public class BOJ11943 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		Integer a1 = Integer.parseInt(st.nextToken());
		Integer o1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Integer a2 = Integer.parseInt(st.nextToken());
		Integer o2 = Integer.parseInt(st.nextToken());
		int min = Math.min(a1 + o2, a2 + o1);
		sb.append(min);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
