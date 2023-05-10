import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ10093 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long max = Math.max(A, B);
		long min = Math.min(A, B);
		if (max == min) {
			sb.append("0");
		} else {
			bw.write(max - min - 1 + "\n");
			for (long i = min + 1; i < max; i++) {
				sb.append(i);
				if (i != max - 1) {
					sb.append(" ");
				}
			}
		}
		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
	}
}
