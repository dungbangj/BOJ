import java.util.*;
import java.io.*;

public class BOJ17202 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String A = br.readLine();
			String B = br.readLine();

			String AB = combineAB(A, B);

			while (AB.length() != 2) {
				AB = getNextAB(AB);
			}
			System.out.println(AB);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String combineAB(String A, String B) {
		StringBuilder result = new StringBuilder();

		int AIdx = 0;
		int BIdx = 0;

		for (int i = 0; i < A.length() + B.length(); i++) {
			if (i % 2 == 0) result.append(A.charAt(AIdx++));
			else result.append(B.charAt(BIdx++));
		}
		return result.toString();
	}

	private static String getNextAB(String AB) {
		StringBuilder result = new StringBuilder();
		char[] ABChar = AB.toCharArray();

		for (int i = 1; i < ABChar.length; i++) {
			int gapNum = ((ABChar[i - 1] - '0') + (ABChar[i] - '0')) % 10;
			result.append(gapNum);
		}
		return result.toString();
	}
}
