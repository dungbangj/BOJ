import java.io.*;
import java.util.Arrays;

public class BOJ1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int A = inputAB[0];
			int B = inputAB[1];

			bw.write(lcm(A, B) + "\n");
		}
		bw.flush();
		bw.close();
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
