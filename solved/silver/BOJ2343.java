import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOJ2343 {
	static int N, M, sum, max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNM[0];
		M = inputNM[1];

		int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		Arrays.sort(inputNums);

		for (int inputNum : inputNums) {
			max = Math.max(max, inputNum);
			sum += inputNum;
		}

		int bMin = max;
		int bMax = sum;
//		System.out.println("inputNums = " + Arrays.toString(inputNums));
//		System.out.println("bMin = " + bMin);
//		System.out.println("bMax = " + bMax);

		while (bMin <= bMax) {
			int tmpSum = 0;
			int mid = (bMin + bMax) / 2;
			int count = 0;

			for (int inputNum : inputNums) {
				if (tmpSum + inputNum > mid) {
					count++;
//					System.out.println("mid = " + mid);
//					System.out.println("tmpSum = " + tmpSum);
					tmpSum = 0;
				}
				tmpSum += inputNum;
			}

			if (tmpSum != 0) count++;
			if (count > M) bMin = mid + 1;
			else bMax = mid - 1;

//			System.out.println("bMin = " + bMin);
//			System.out.println("bMax = " + bMax);
//			System.out.println();
		}

		bw.write(bMin + "\n");
		bw.flush();
		bw.close();
	}
}
