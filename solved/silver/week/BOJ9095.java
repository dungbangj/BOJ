import java.util.*;
import java.io.*;

public class BOJ9095 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int T = Integer.parseInt(br.readLine());
			int[] inputs = new int[T];

			for (int i = 0; i < T; i++) {
				inputs[i] = Integer.parseInt(br.readLine());
			}

			int[] dp = new int[findMaxVal(inputs) + 1];
			dp[1] = 1; // 1
			dp[2] = 2; // 1, 1 - 2
			dp[3] = 4; // 1, 1, 1 - 1, 2 - 2, 1 - 3

			for (int i = 4; i < dp.length; i++) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}

			for (int i = 0; i < T; i++) {
				bw.write(dp[inputs[i]] + "\n");
			}

			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static int findMaxVal(int[] arr) {
		int max = -1;
		for (int num : arr) {
			if (max < num) max = num;
		}
		return max;
	}
}
