import java.io.*;
import java.util.Arrays;

public class BOJ2023 {
	static int[] first = {2, 3, 5, 7};
	static int[] rest = {1, 3, 5, 7, 9};
//	static boolean[] eratos;
	static int N, maxNine;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
//		maxNine = makeNines();
//		eratos = new boolean[maxNine + 1];

//		makeEratos();
		for (int firstNum : first) {
			dfs(firstNum, N - 1);
		}
		bw.flush();
		bw.close();
	}

	static void dfs(int num, int depth) throws IOException {
		if (depth == 0) {
			bw.write(num + "\n");
			return;
		}

		for (int restNum : rest) {
			int madeNum = num * 10 + restNum;
			if (isPrime(madeNum)) dfs(madeNum, depth - 1);
		}
	}

	static boolean isPrime(int num) {
		if (num < 2) return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

//	static void makeEratos() {
//		Arrays.fill(eratos, true);
//		eratos[0] = eratos[1] = false;
//
//		for (int i = 2; i * i <= maxNine; i++) {
//			if (eratos[i]) {
//				for (int j = i * i; j <= maxNine; j += i) {
//					eratos[j] = false;
//				}
//			}
//		}
//	}
//
//	static int makeNines() {
//		int nines = 9;
//		for (int i = 1; i < N; i++) {
//			nines = nines * 10 + 9;
//		}
//		return nines;
//	}
}
