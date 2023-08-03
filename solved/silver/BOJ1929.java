import java.io.*;
import java.util.*;

public class BOJ1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputMN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int M = inputMN[0];
		int N = inputMN[1];

		for (int i = M; i <= N; i++) {
			if (isPrime(i)) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

	private static boolean isPrime(int num) {
		if (num == 2 || num == 3) {
			return true;
		} else if (num <= 1 || num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
