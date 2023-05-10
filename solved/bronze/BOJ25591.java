import java.io.*;
import java.util.StringTokenizer;

public class BOJ25591 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int a = 100 - Integer.parseInt(st.nextToken());
		int b = 100 - Integer.parseInt(st.nextToken());
		int c = 100 - (a + b);
		sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(a * b).append(" ");
		sb.append((a * b) / 100).append(" ").append((a * b) % 100).append("\n");
		sb.append((a * b) / 100 + c).append(" ").append((a * b) % 100);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
