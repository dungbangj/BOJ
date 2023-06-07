import java.io.*;
import java.util.*;

public class BOJ9095 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int[] dp = new int[12];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(dp[N] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
