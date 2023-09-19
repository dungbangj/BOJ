import java.io.*;
import java.util.Arrays;

public class BOJ12891 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int[] inputSP = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int S = inputSP[0];
		int P = inputSP[1];
		int count = 0;

		int[] ACGTCounts = new int[4];
		char[] inputPW = br.readLine().toCharArray();

		/**
		 * 입력된 비밀번호에서 ACGT 갯수를 뽑아낸다.
		 * inputPW의 길이가 S이지만, P까지만 확인을 해서 처음에 나오고, 아무것도 바꾸지 않은 부분 문자열이 가능한 경우인지 확인한다.
		 */
		for (int i = 0; i < P; i++) {
			plusACGT(ACGTCounts, inputPW[i]);
		}

		int[] mustHavePW = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		System.out.println("mustHavePW = " + Arrays.toString(mustHavePW));
//		System.out.println("inputPW = " + Arrays.toString(inputPW));

		/**
		 * 처음에 아무것도 바꾸지 않은 부분 문자열이 조건을 충족한다면 count를 증가시킨다.
		 */
		if (isPossible(ACGTCounts, mustHavePW)) count++;

		/**
		 * 부분 문자열은 연속해야 하므로 전체 문자열의 앞과 뒤에서만 문자를 빼고 더해야한다. 그러므로 S - P까지만 removeIdx를 이동시킨다.
		 * removeIdx가 0 인덱스부터 시작하므로 끝 부분은 당연히 removeIdx + P이다.
		 * minusACGT로 앞 부분의 문자를 빼고, plusACGT로 뒷 부분에 문자열을 더한다.
		 */
//		System.out.println("ACGTCounts = " + Arrays.toString(ACGTCounts));

		for (int removeIdx = 0; removeIdx < S - P; removeIdx++) {
			int addIdx = removeIdx + P;
			minusACGT(ACGTCounts, inputPW[removeIdx]);
//			System.out.println("inputPW = " + inputPW[removeIdx]);
//			System.out.println("ACGTCounts = " + Arrays.toString(ACGTCounts));

			plusACGT(ACGTCounts, inputPW[addIdx]);
//			System.out.println("inputPW = " + inputPW[addIdx]);
//			System.out.println("ACGTCounts = " + Arrays.toString(ACGTCounts));
			if (isPossible(ACGTCounts, mustHavePW)) count++;
//			System.out.println();
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	private static void plusACGT(int[] ACGTCounts, char one) {
		if (one == 'A') ACGTCounts[0]++;
		else if (one == 'C') ACGTCounts[1]++;
		else if (one == 'G') ACGTCounts[2]++;
		else ACGTCounts[3]++;
	}

	private static void minusACGT(int[] ACGTCounts, char one) {
		if (one == 'A') ACGTCounts[0]--;
		else if (one == 'C') ACGTCounts[1]--;
		else if (one == 'G') ACGTCounts[2]--;
		else ACGTCounts[3]--;
	}

	private static boolean isPossible(int[] ACGTCounts, int[] mustHavePW) {
		for (int i = 0; i < ACGTCounts.length; i++) {
			if (ACGTCounts[i] < mustHavePW[i]) return false;
		}
		return true;
	}
}
