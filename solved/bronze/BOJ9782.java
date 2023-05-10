import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ9782 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int j = 1;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			if (T == 0) {
				break;
			}
			ArrayList<Integer> inputs = new ArrayList<>();
			for (int i = 0; i < T; i++) {
				inputs.add(Integer.parseInt(st.nextToken()));
			}
			sb.append("Case ").append(j++).append(": ");
			if (T % 2 == 1) {
				sb.append(String.format("%.1f", (float)inputs.get(T / 2)));
			} else {
				float mid = (float)(inputs.get(T / 2) + inputs.get(T / 2 - 1)) / 2;
				sb.append(String.format("%.1f", mid));
			}
			sb.append("\n");
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
