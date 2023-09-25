import java.io.*;
import java.util.Arrays;

public class BOJ1377 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Num[] arr = new Num[N];
		for (int i = 0; i < N; i++) {
			arr[i] = new Num(Integer.parseInt(br.readLine()), i);
		}

		mergeSort(arr);

		int maxMove = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].idx - i > maxMove) {
				maxMove = arr[i].idx - i;
			}
		}

		bw.write(maxMove + 1 + "\n");
		bw.flush();
		bw.close();
	}

	static void mergeSort(Num[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int mid = arr.length / 2;
		Num[] leftArr = Arrays.copyOfRange(arr, 0, mid);
		Num[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

		mergeSort(leftArr);
		mergeSort(rightArr);

		merge(arr, leftArr, rightArr);
	}

	static void merge(Num[] arr, Num[] leftArr, Num[] rightArr) {
		int i = 0, l = 0, r = 0;

		while (l < leftArr.length && r < rightArr.length) {
			if (leftArr[l].val <= rightArr[r].val) arr[i++] = leftArr[l++];
			else arr[i++] = rightArr[r++];
		}

		while (l < leftArr.length) {
			arr[i++] = leftArr[l++];
		}

		while (r < rightArr.length) {
			arr[i++] = rightArr[r++];
		}
	}

	static class Num {
		int val;
		int idx;

		public Num(int val, int idx) {
			this.val = val;
			this.idx = idx;
		}
	}

}
