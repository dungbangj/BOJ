import java.io.*;
import java.util.*;

public class BOJ21854 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int MOD = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		long sum = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sum = toMod(sum + dac(Integer.parseInt(st.nextToken())));
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static long toMod(long num) {
		return num % MOD;
	}

	private static long dac(long B) {
		if (B == 1) {
			return 2;
		} else if (B == 0) {
			return 1;
		}

		long tmp = dac(B / 2);

		if (B % 2 == 1) {
			return toMod(toMod(tmp * tmp) * 2);
		}
		return toMod(tmp * tmp);
	}
}
