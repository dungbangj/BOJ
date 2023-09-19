import java.io.*;
import java.util.Arrays;

public class BOJ1253 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		/**
		 * 투 포인터를 위해서 정렬
		 */
		mergeSort(inputNums);
		int count = 0;

		for (int i = 0; i < N; i++) {
			int targetNum = inputNums[i];
			int targetIdx = i;
			int startIdx = 0;
			int endIdx = N - 1;

			/**
			 * 처음과 끝에서 시작해서 targetNum을 찾는다.
			 */
			while (startIdx < endIdx) {
				if (startIdx == targetIdx) startIdx++;
				else if (endIdx == targetIdx) endIdx--;
				else {
					int startNum = inputNums[startIdx];
					int endNum = inputNums[endIdx];
					long sum = startNum + endNum;

					if (sum < targetNum) startIdx++;
					else if (sum > targetNum) endIdx--;
					else {
						count++;
//					System.out.println(startNum + " +  " + endNum + " = " + sum);
						break;
					}
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	static void mergeSort(int[] inputNums) {
		if (inputNums == null || inputNums.length <= 1) return;

		int mid = inputNums.length / 2;
		int[] leftArr = Arrays.copyOfRange(inputNums, 0, mid);
		int[] rightArr = Arrays.copyOfRange(inputNums, mid, inputNums.length);

		mergeSort(leftArr);
		mergeSort(rightArr);

		merge(inputNums, leftArr, rightArr);
	}

	static void merge(int[] inputNums, int[] leftArr, int[] rightArr) {
		int i = 0, l = 0, r = 0;

		while (l < leftArr.length && r < rightArr.length) {
			if (leftArr[l] <= rightArr[r]) inputNums[i++] = leftArr[l++];
			else inputNums[i++] = rightArr[r++];
		}

		while (l < leftArr.length) {
			inputNums[i++] = leftArr[l++];
		}

		while (r < rightArr.length) {
			inputNums[i++] = rightArr[r++];
		}
	}
}
