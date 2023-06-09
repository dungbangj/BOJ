import java.io.*;
import java.util.*;

public class BOJ1149 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int MIN_INDEX;

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		int[][] houseColors = new int[N][3];
		int[][] dp = new int[N][3];

		for (int i = 0; i < N; i++) {
			String[] inputLine = br.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				houseColors[i][j] = Integer.parseInt(inputLine[j]);
			}
		}

		System.arraycopy(houseColors[0], 0, dp[0], 0, 3);

		for (int i = 1; i < N; i++) {
			dp[i][0] = houseColors[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = houseColors[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] = houseColors[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
		}

		int minVal = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			if (minVal > dp[N - 1][i]) {
				minVal = dp[N - 1][i];
			}
		}
		bw.write(minVal + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
