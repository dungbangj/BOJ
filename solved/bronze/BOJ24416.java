import java.util.*;
import java.io.*;

public class BOJ24416 {
	static int fiboRecurTimes = 0;
	static int fiboDpTimes = 0;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] fiboDp = new int[50];

		try {
			int n = Integer.parseInt(br.readLine());

			getFiboRecur(n);
			bw.write(fiboRecurTimes + " ");
			getFiboDp(n, fiboDp);
			bw.write(fiboDpTimes + "\n");
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static long getFiboRecur(int n) {
		if (n == 1 || n == 2) {
			fiboRecurTimes++;
			return 1;
		}
		return getFiboRecur(n - 1) + getFiboRecur(n - 2);
	}

	private static void getFiboDp(int n, int[] fiboDp) {
		fiboDp[0] = 0;
		fiboDp[1] = fiboDp[2] = 1;

		for (int i = 3; i <= n; i++) {
			fiboDpTimes++;
			fiboDp[i] = fiboDp[i - 1] + fiboDp[i - 2];
		}
	}
}
