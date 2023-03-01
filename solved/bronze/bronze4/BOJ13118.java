import java.io.*;
import java.util.StringTokenizer;

public class BOJ13118 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int[] human = new int[4];
		for (int i = 0; i < 4; i++) {
			human[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (human[i] == x) {
				sb.append(i + 1).append(" ");
				count++;
			}
		}
		if (count == 0) {
			sb.append(0);
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
