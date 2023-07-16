import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class BOJ12891 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int S = input[0];
		int P = input[1];

		char[] tempPassword = br.readLine().toCharArray();
		int[] ACGT = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int count = 0;
		int[] tempACGT = {0, 0, 0, 0};

		for (int i = 0; i < P; i++) {
			plusACGT(tempACGT, tempPassword[i]);
		}

//		System.out.println(Arrays.toString(tempACGT));
		if (isGoodPassword(tempACGT, ACGT)) {
			count++;
		}

		for (int removeIdx = 0; removeIdx < S - P; removeIdx++) {
			int addIdx = removeIdx + P;
			minusACGT(tempACGT, tempPassword[removeIdx]);
			plusACGT(tempACGT, tempPassword[addIdx]);
			if (isGoodPassword(tempACGT, ACGT)) {
				count++;
			}
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	private static void minusACGT(int[] tempACGT, char one) {
		if (one == 'A') {
			tempACGT[0]--;
		} else if (one == 'C') {
			tempACGT[1]--;
		} else if (one == 'G') {
			tempACGT[2]--;
		} else if (one == 'T') {
			tempACGT[3]--;
		}
	}

	private static void plusACGT(int[] tempACGT, char one) {
		if (one == 'A') {
			tempACGT[0]++;
		} else if (one == 'C') {
			tempACGT[1]++;
		} else if (one == 'G') {
			tempACGT[2]++;
		} else if (one == 'T') {
			tempACGT[3]++;
		}
	}

	private static boolean isGoodPassword(int[] tempACGT, int[] ACGT) {
		for (int i = 0; i < tempACGT.length; i++) {
			if (tempACGT[i] < ACGT[i]) {
				return false;
			}
		}
		return true;
	}
}
