import java.io.*;
import java.util.Arrays;

public class BOJ2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			int inputNum = Integer.parseInt(br.readLine());
			arr[i] = inputNum;
		}
		mergeSort(arr);

		for (int num : arr) {
			bw.write(num + "\n");
		}
		bw.flush();
		bw.close();
	}

	static void mergeSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}

		int mid = arr.length / 2;
		int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
		int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

		mergeSort(leftArr);
		mergeSort(rightArr);

		merge(arr, leftArr, rightArr);
	}

	static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int i = 0, l = 0, r = 0;

		while (l < leftArr.length && r < rightArr.length) {
			if (leftArr[l] <= rightArr[r]) arr[i++] = leftArr[l++];
			else arr[i++] = rightArr[r++];
		}

		while (l < leftArr.length) {
			arr[i++] = leftArr[l++];
		}

		while (r < rightArr.length) {
			arr[i++] = rightArr[r++];
		}
	}
}
