import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class BOJ2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] inputArr = new int[N];

		for (int i = 0; i < N; i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
		}

		mergeSort(inputArr);
		for (int num : inputArr) {
			bw.write(num + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static void mergeSort(int[] inputArr) {
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

	private static void merge(int[] inputArr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				inputArr[k++] = left[i++];
			} else {
				inputArr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			inputArr[k++] = left[i++];
		}

		while (j < right.length) {
			inputArr[k++] = right[j++];
		}
	}
}
