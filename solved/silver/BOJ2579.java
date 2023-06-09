import java.io.*;
import java.util.*;

public class BOJ2579 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N;
	static int[] dp, inputArr;

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		inputArr = new int[N + 1];
		inputArr[N] = 0;
		dp = new int[N + 1];

		for (int i = 1; i <= N; i++){
			inputArr[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = inputArr[0];
		dp[1] = inputArr[1];
		if (inputArr.length > 2) {
			dp[2] = inputArr[1] + inputArr[2];
		}
		for (int i = 3; i <= N; i++) {
			dp[i] = inputArr[i] + Math.max(inputArr[i - 1] + dp[i - 3], dp[i - 2]);
		}

		bw.write(dp[N] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}

