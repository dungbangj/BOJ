import java.io.*;
import java.util.Arrays;

/**
 * 고려해야할 것
 * - 투 포인터: 시작과 끝에서 두 포인터가 좁혀진다.
 * - 최악 시간 복잡도: N2(버블 소트)
 * - 최선 시간 복잡도: NlogN(머지 소트)
 */

public class BOJ1940 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		mergeSort(inputNums);

		int start = 0;
		int last = N - 1;
		int count = 0;
		int sum;

		/**
		 * 투포인터가 배열의 양쪽에서 시작하여 서로 좁혀지면서 sum 값을 계산한다. 해당 while문은 N/2의 시간 복잡도를 가진다.
		 */
		while (start < last) {
			sum = inputNums[start] + inputNums[last];
			if (sum < M) start++;
			else if (sum > M) last--;
			else {
				count++;
				start++;
			}
//			System.out.println("sum = " + sum);
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	static void mergeSort(int[] inputNums) {
		if (inputNums == null || inputNums.length == 1) return;

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
