import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ5988 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			BigInteger bigNum = new BigInteger(br.readLine());
			if (bigNum.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
				sb.append("even");
			} else {
				sb.append("odd");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
