import java.io.*;
import java.util.Arrays;

/**
 * 고려해야할 것
 * - 1차원 구간 합 공식
 * - 최악 시간 복잡도: N2
 * - 최선 시간 복잡도: N
 */

public class BOJ11659 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


	public static void main(String[] args) throws IOException {
		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0];
		int M = inputNM[1];

		int[] inputNum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] sumArr = new int[inputNum.length + 1];
		sumArr[0] = 0;
		/*
		 * 각 자리까지의 합을 먼저 구한다.
		 */
		for (int i = 1; i <= inputNum.length; i++) {
			sumArr[i] = sumArr[i - 1] + inputNum[i - 1];
		}

		/*
		 * 구간 합의 공식은 S[A ~ B] = S[B] - S[A - 1]
		 */
		for (int i = 0; i < M; i++) {
			int[] inputRange = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int start = inputRange[0] - 1; // S[A - 1]
			int end = inputRange[1]; // S[B]

			bw.write(sumArr[end] - sumArr[start] + "\n");
		}
//		System.out.println("inputNum = " + Arrays.toString(inputNum));
//		System.out.println("sumArr = " + Arrays.toString(sumArr));

		bw.flush();
		bw.close();
	}
}
