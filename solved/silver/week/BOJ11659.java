import java.io.*;
import java.util.*;

public class BOJ11659 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String[] inputNM = br.readLine().split(" ");
		String[] inputNums = br.readLine().split(" ");
		int N = Integer.parseInt(inputNM[0]);
		int M = Integer.parseInt(inputNM[1]);

		int[] dp = new int[N];
		dp[0] = Integer.parseInt(inputNums[0]);
		for (int i = 1; i < N; i++) {
			dp[i] = dp[i - 1] + Integer.parseInt(inputNums[i]);
		}
		System.out.println("dp = " + Arrays.toString(dp));
		int[] arr = new int[N];∑∑∑∑
		for (int i = 0; i < M; i++) {
			String[] inputIJ = br.readLine().split(" ");
			int I = Integer.parseInt(inputIJ[0]);
			int J = Integer.parseInt(inputIJ[1]);


		}
	}
}
