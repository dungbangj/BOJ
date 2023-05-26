import java.io.*;
import java.util.*;

public class BOJ13171 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		long A = Long.parseLong(br.readLine());
		long B = Long.parseLong(br.readLine());
		int C = 1_000_000_007;
		long mul = 1L;
		A %= C;

		while (B > 0) {
			if ((B & 1) == 1) {
				mul = mul * A % C;
			}
			B >>= 1;
			A = A * A % C;
		}

		bw.write(mul + "\n");
		bw.flush();
		bw.close();
	}
}
