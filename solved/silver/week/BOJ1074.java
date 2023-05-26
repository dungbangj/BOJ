import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ1074 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long N, r, c;
	static BigInteger answer;

	public static void main(String[] args) throws IOException {

		String[] input = br.readLine().split(" ");
		N = Long.parseLong(input[0]);
		r = Long.parseLong(input[1]);
		c = Long.parseLong(input[2]);
		long len = (long) Math.pow(2, N);
		long diff = len / 4 * len;

		check(len, diff, 0, 0, new BigInteger("0"));

		bw.write(answer.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static void check(long len, long diff, long startR, long startC, BigInteger bigInteger) {

		if (len == 0) {
			len = 1;
		}
		if (diff == 0) {
			diff = 1;
		}
		if (startR == r && startC == c) {
			answer = bigInteger;
			return;
		}
		long limit = len - len / 2;
		long limitR = startR + limit;
		long limitC = startC + limit;

//		System.out.prlongln("ans = " + ans + ", limitR = " + limitR + ", limitC = " + limitC + ", startR = " + startR + ", startC = " + startC);
		if (r < limitR && c < limitC) { // 1
			check(len / 2, diff / 4, startR, startC, bigInteger);

		} else if (r < limitR) { // 2
			check(len / 2, diff / 4, startR, startC + limit, bigInteger.add(new BigInteger(String.valueOf(diff))));

		} else if (c < limitC) { // 3
			check(len / 2, diff / 4, startR + limit, startC, bigInteger.add(new BigInteger(String.valueOf(diff * 2))));

		} else { // 4
			check(len / 2, diff / 4, startR + limit, startC + limit, bigInteger.add(new BigInteger(String.valueOf(diff * 3))));
		}

	}
}
