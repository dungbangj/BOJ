import java.io.*;
import java.util.Arrays;

public class BOJ10986 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0];
		int M = inputNM[1];

		long count = 0;
		long[] sumPlusArr = new long[N + 1];
		long[] sameModeArr = new long[M];
		int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		for (int i = 1; i <= N; i++) {
			/**
			 * 누적합 배열을 누적합으로 채우지 않고, 바로 M으로 나눈 나머지를 저장해준다. M으로 바로 나눠 떨어진다면 count를 증가시킨다.
			 */
			sumPlusArr[i] = (sumPlusArr[i - 1] + inputNums[i - 1]) % M;
			if (sumPlusArr[i] == 0) count++;
			/**
			 * 나머지를 저장하는 배열을 증가시킨다.
			 */
			sameModeArr[(int) sumPlusArr[i]]++;
		}
//		System.out.println(Arrays.toString(sumPlusArr));

		for (int i = 0; i < M; i++) {
			/**
			 * 3C2 + 2C2 = (3 * 2) / (2 * 1) + (2 * 1) / (2 * 1) = 4
			 *
			 * 공식
			 * sameModeArr[i]C2 = (sameModeArr[i] * (sameModeArr[i] - 1)) / 2
			 */
			if (sameModeArr[i] > 1) count += (sameModeArr[i] * (sameModeArr[i] - 1) / 2);
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
