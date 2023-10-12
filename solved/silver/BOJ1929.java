import java.io.*;
import java.util.Arrays;

public class BOJ1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputMN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int M = inputMN[0];
		int N = inputMN[1];

		boolean[] eratosArr = new boolean[N + 1];

		makeEratos(eratosArr);

		for (int i = M; i <= N; i++) {
			if (eratosArr[i]) bw.write(i + "\n");
		}

		bw.flush();
		bw.close();
	}

	static void makeEratos(boolean[] eratosArr) {
		Arrays.fill(eratosArr, true);
		eratosArr[0] = eratosArr[1] = false;
		int max = eratosArr.length - 1;

		for (int i = 2; i * i <= max; i++) {
			if (eratosArr[i]) {
				for (int j = i * i; j <= max; j += i) {
					eratosArr[j] = false;
				}
			}
		}
	}
}
