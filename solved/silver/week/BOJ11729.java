import java.io.*;
import java.util.*;

public class BOJ11729 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		bw.write(hanoiCount(N, 1, 2, 3, sb, 1) + "\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int hanoiCount(int N, int start, int sub, int to, StringBuilder sb, int count) {

		if (N == 1) {
			sb.append(start).append(" ").append(to).append("\n");
			return count;
		}

		count = hanoiCount(N - 1, start, to, sub, sb, count + 1);
		sb.append(start).append(" ").append(to).append("\n");
		count = hanoiCount(N - 1, sub, start, to, sb, count + 1);
		return count;
	}
}
