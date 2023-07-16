import java.io.*;
import java.util.*;

public class BOJ10986 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		long count = 0;
		long[] sumArr = new long[N + 1];
		long[] sameModArr = new long[M];
		input = br.readLine().split(" ");

		for (int i = 1; i <= N; i++) {
			fillSumArr(input, M, sumArr, i);
			if (isDividable(sumArr[i])) {
				count++;
			}
			sameModArr[(int) sumArr[i]]++;
		}

		for (int i = 0; i < M; i++) {
			if (sameModArr[i] > 1) {
				count += (sameModArr[i] * (sameModArr[i] - 1) / 2);
//				count += combination((int) sameModArr[i], 2);
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	private static boolean isDividable(long sumArr) {
		return sumArr == 0;
	}

	private static void fillSumArr(String[] input, int M, long[] sumArr, int i) {
		sumArr[i] = (sumArr[i - 1] + Integer.parseInt(input[i - 1])) % M;
	}

	private static int combination(int n, int r) {

		if (n == r || r == 0) {
			return 1;
		}

		return combination(n - 1, r - 1) + combination(n - 1, r);
	}
}
