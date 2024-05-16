import java.util.*;
import java.io.*;

public class BOJ1463 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int N = Integer.parseInt(br.readLine());
			int[] dp;

			if (N <= 10) dp = new int[11];
			else dp = new int[N + 1];
			dp[1] = 0;
			dp[2] = 1;
			dp[3] = 1;

			for (int i = 4; i <= N; i++) {
				if (i % 2 == 0 && i % 3 == 0) dp[i] = findMinVal(dp[i / 2], dp[i / 3], dp[i - 1]) + 1;
				else if (i % 2 == 0) dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
				else if (i % 3 == 0) dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
				else dp[i] = dp[i - 1] + 1;
			}
			bw.write(dp[N] + "\n");
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static int findMinVal(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
