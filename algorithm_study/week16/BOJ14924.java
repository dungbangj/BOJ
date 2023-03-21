import java.io.*;
import java.util.StringTokenizer;

public class BOJ14924 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int train = Integer.parseInt(st.nextToken());
		int fly = Integer.parseInt(st.nextToken());
		int distance = Integer.parseInt(st.nextToken());
		int time = distance / (2 * train);

		sb.append(fly * time);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
