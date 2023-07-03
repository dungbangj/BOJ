import java.io.*;
import java.util.Arrays;

public class BOJ17425 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static final int MAX = 1_000_000;
	static long[] dp;
	static long[] fx;

	public static void main(String[] args) throws IOException {

		int T = Integer.parseInt(br.readLine());

		initArr();
		getDivisors();
		getDivisorSum();
		printAnswer(T);
	}

	private static void printAnswer(int T) throws IOException {
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(dp[N] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static void initArr() {
		dp = new long[MAX + 1];
		fx = new long[MAX + 1];
		Arrays.fill(fx, 1);
	}

	private static void getDivisorSum() {
		for (int i = 1; i <= MAX; i++) {
			dp[i] = dp[i - 1] + fx[i];
		}
	}

	private static void getDivisors() {
		for (int i = 2; i <= MAX; i++) {
			for (int j = 1; i * j <= MAX; j++) {
				fx[i * j] += i;
			}
		}
	}
}
