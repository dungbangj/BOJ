import java.io.*;
import java.util.*;

public class BOJ1629 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] main) throws IOException {

		st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());

		bw.write(dac(A, B, C) + "\n");
		bw.flush();
		bw.close();
	}

	private static long dac(long A, long B, long C) {
		if (B == 1) {
			return A % C;
		}

		long tmp = dac(A, B / 2, C);

		if (B % 2 == 1) {
			return (tmp * tmp % C) * A % C;
		}
		return tmp * tmp % C;
	}
}
