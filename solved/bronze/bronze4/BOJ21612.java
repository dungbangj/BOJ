import java.io.*;
import java.util.*;

public class BOJ21612 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine());
		int P = 5 * B - 400;
		int res = 0;

		if (P < 100) {
			res = 1;
		} else if (P == 100) {
			res = 0;
		} else {
			res = -1;
		}
		System.out.println(P + "\n" + res);
	}
}