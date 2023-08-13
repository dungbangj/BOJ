import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class BOJ1850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] inputAB = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long A = inputAB[0];
		long B = inputAB[1];

		long gcdNum = gcd(Math.max(A, B), Math.min(A, B));
		for (int i = 0; i < gcdNum; i++) {
			bw.write("1");
		}
		bw.newLine();
		bw.flush();
		bw.close();
	}

	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
