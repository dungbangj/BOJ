import java.io.*;
import java.util.*;

public class BOJ1517 {

	static long swaps;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		Comp[] arr = new Comp[N];
		for (int i = 0; i < N; i++) {
			arr[i] = new Comp(i, inputArr[i]);
		}
//		System.out.println("===Before Sort===");
//		printComp(N, arr);

		mergeSort(arr);

//		System.out.println("===After Sort===");
//		printComp(N, arr);

		bw.write(swaps + "\n");
		bw.flush();
		bw.close();
	}

	private static void printComp(int N, Comp[] arr) {
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i].val + " ");
		}
		System.out.println();

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i].idx + " ");
		}
		System.out.println();
	}

	static class Comp implements Comparable<Comp> {
		int idx;
		long val;

		Comp(int idx, long val) {
			this.idx = idx;
			this.val = val;
		}

		@Override
		public int compareTo(Comp o) {
			return Long.compare(this.val, o.val);
		}
	}

	private static long mergeSort(Comp[] arr) {
		if (arr == null || arr.length <= 1) {
			return 0;
		}

		int mid = arr.length / 2;
		Comp[] left = Arrays.copyOfRange(arr, 0, mid);
		Comp[] right = Arrays.copyOfRange(arr, mid, arr.length);

		swaps = mergeSort(left) + mergeSort(right);

		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i].val <= right[j].val) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
				swaps += left.length - i;
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}

		return swaps;
	}
}
