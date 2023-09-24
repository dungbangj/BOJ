import java.io.*;

public class BOJ2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		bubbleSort(arr);

		for (int num : arr) {
			bw.write(num + "\n");
		}
		bw.flush();
		bw.close();
	}

	static void bubbleSort(int[] arr) {
		boolean swapped = false;

		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					swapped = true;
				}
			}

			if (!swapped) break;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
