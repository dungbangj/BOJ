import java.io.*;
import java.util.Arrays;

public class BOJ11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNK[0];
		int K = inputNK[1];

//		System.out.println(Arrays.toString(inputArr));

		mergeSort(inputArr);

//		System.out.println(Arrays.toString(inputArr));

		bw.write(inputArr[K - 1] + "\n");
		bw.flush();
		bw.close();
	}

	static void mergeSort(int[] inputArr) {
		if (inputArr == null || inputArr.length <= 1) {
			return;
		}

		int mid = inputArr.length / 2;
		int[] leftArr = Arrays.copyOfRange(inputArr, 0, mid);
		int[] rightArr = Arrays.copyOfRange(inputArr, mid, inputArr.length);

		mergeSort(leftArr);
		mergeSort(rightArr);

		merge(inputArr, leftArr, rightArr);
	}

	static void merge(int[] inputArr, int[] leftArr, int[] rightArr) {
		int i = 0, l = 0, r = 0;

		while (l < leftArr.length && r < rightArr.length) {
			if (leftArr[l] <= rightArr[r]) inputArr[i++] = leftArr[l++];
			else inputArr[i++] = rightArr[r++];
		}

		while (l < leftArr.length) {
			inputArr[i++] = leftArr[l++];
		}
		while (r < rightArr.length) {
			inputArr[i++] = rightArr[r++];
		}
	}
}
