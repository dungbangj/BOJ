import java.io.*;
import java.util.*;

public class BOJ1456 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		long A = inputAB[0];
		long B = inputAB[1];
		int Max =(int) (Math.sqrt(B) + 1);

		boolean[] isPrime = new boolean[Max];

		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i < Max; i++) {
			for (int j = 2; i * j < Max; j++) {
				isPrime[i * j] = false;
			}
		}

		int count = 0;
		for (int i = 2; i < Max; i++) {
			if (isPrime[i]) {
				for (int j = 2; Math.pow(i, j) <= B; j++) {
					if (A <= Math.pow(i, j)) {
						count++;
					}
				}
			}
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
