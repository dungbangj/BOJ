import java.io.*;
import java.util.*;

public class BOJ11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0], M = inputNM[1];

		mergeSort(inputArr);
//		System.out.println("N = " + N);
//		System.out.println("M = " + M);
//		System.out.println(Arrays.toString(inputArr));
		bw.write(inputArr[M - 1] + "\n");
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
