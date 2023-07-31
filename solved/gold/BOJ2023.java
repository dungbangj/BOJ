import java.io.*;
import java.util.*;

public class BOJ2023 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		recur(0, N);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static void recur(int madeNum, int depth) {
		if (depth == 0) {
			if (isPrime(madeNum)) {
				sb.append(madeNum + "\n");
				return;
			}
		}

		for (int i = 0; i < 10; i++) {
			int nextMadeNum = madeNum * 10 + i;
			if (isPrime(nextMadeNum)) {
				recur(nextMadeNum, depth - 1);
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
