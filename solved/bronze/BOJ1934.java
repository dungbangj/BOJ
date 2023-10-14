import java.io.*;
import java.util.Arrays;

public class BOJ1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int A = inputAB[0];
			int B = inputAB[1];
			int small = Math.min(A, B);
			int big = Math.max(A, B);
			bw.write(lcm(big, small) + "\n");
		}
		bw.flush();
		bw.close();
	}

	static int lcm(int A, int B) {
		return A * B / gcd(A, B);
	}

	static int gcd(int A, int B) {
		return A % B == 0 ? B : gcd(B, A % B);
	}
}
