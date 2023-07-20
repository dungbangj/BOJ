import java.io.*;
import java.util.*;

public class BOJ11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		System.out.println(Arrays.toString(inputArr));
		mergeSort(inputArr);
//		System.out.println(Arrays.toString(inputArr));

		long sum = 0;
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = 0; j < i + 1; j++) {
//				System.out.println(inputArr[j]);
				sum += inputArr[j];
			}
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
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
