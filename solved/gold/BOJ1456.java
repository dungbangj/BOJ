import java.io.*;
import java.util.Arrays;

public class BOJ1456 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long A = inputAB[0];
		long B = inputAB[1];
		int max = (int) (Math.sqrt(B) + 1);

		boolean[] eratos = new boolean[max + 1];
		makeEratos(max, eratos);
		bw.write(countNearPrime(A, B, max, eratos) + "\n");
		bw.flush();
		bw.close();
	}

	static void makeEratos(int max, boolean[] eratos) {
		Arrays.fill(eratos, true);
		eratos[0] = eratos[1] = false;

		for (int i = 2; i < max; i++) {
			for (int j = 2; i * j < max; j++) {
				eratos[i * j] = false;
			}
		}
	}

	static int countNearPrime(long A, long B, int max, boolean[] eratos) {
		int count = 0;
		for (int i = 2; i < max; i++) {
			if (eratos[i]) {
				for (int j = 2; Math.pow(i, j) <= B; j++) {
					if (A <= Math.pow(i, j)) count++;
				}
			}
		}
		return count;
	}
}