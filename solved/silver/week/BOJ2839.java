import java.util.*;
import java.io.*;

public class BOJ2839 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int kg = Integer.parseInt(br.readLine());
			int[] dp;
			if (kg < 5) dp = new int[10];
			else dp = new int[kg + 1];
			Arrays.fill(dp, -1);
			dp[3] = dp[5] = 1;

			for (int i = 6; i <= kg; i++) {
				if (dp[i - 3] != -1) dp[i] = dp[i - 3] + 1;
				if (dp[i - 5] != -1) {
					if (dp[i] == -1) dp[i] = dp[i - 5] + 1;
					else dp[i] = Math.min(dp[i], dp[i - 5] + 1);
				}
			}
			bw.write(dp[kg] + "\n");
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
