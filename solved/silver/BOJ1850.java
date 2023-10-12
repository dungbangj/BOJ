import java.io.*;
import java.util.Arrays;

public class BOJ1850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long A = inputAB[0];
		long B = inputAB[1];

		long result = eucli(A, B);

		for (int i = 0; i < result; i++) {
			bw.write("1");
		}
		bw.flush();
		bw.close();
	}

	static long eucli(long big, long small) {
		long mod = big % small;
		return mod != 0 ? eucli(small, mod) : small;
	}
}
