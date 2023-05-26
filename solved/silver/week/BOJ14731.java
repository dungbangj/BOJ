import java.util.*;
import java.io.*;

public class BOJ14731 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int MOD = 1_000_000_007;

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		int x = 2;
		long sum = 0L;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			long num1 = Long.parseLong(st.nextToken());
			long num2 = Long.parseLong(st.nextToken());

			if (num2 < 1) {
				continue;
			}
			sum = doMod(sum + doMod(doMod(num1 * num2) * doMod(dac(x, num2 - 1))));

		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static long doMod(long num) {
		return num % MOD;
	}

	private static long dac(long A, long B) {
		long mul = 1L;

		while (B > 0) {
			if ((B & 1) == 1) {
				mul = doMod(mul * A);
			}
			B >>= 1;
			A = doMod(A * A);
		}
		return mul;
	}
}
