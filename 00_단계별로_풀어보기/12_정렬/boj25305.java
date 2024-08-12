import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj25305 {

	public static void main(String[] args) {
		try {
			printOutput(sortNumbers(getInputData()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] firstInput = Arrays.stream(br.readLine().split(" "))
									 .mapToInt(Integer::parseInt)
									 .toArray();
			int[] inputData = new int[firstInput[0] + 1];
			String[] secondInput = br.readLine().split(" ");

			for (int i = 0; i < firstInput[0]; i++) {
				inputData[i] = Integer.parseInt(secondInput[i]);
			}
			inputData[inputData.length - 1] = firstInput[1];
			return inputData;
		}
	}

	private static String sortNumbers(int[] inputData) {
		int rank = inputData[inputData.length - 1];
		inputData[inputData.length - 1] = -1;

		MergeSort.mergeSort(inputData, 0, inputData.length - 1);

		return String.valueOf(inputData[inputData.length - rank]);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}

class MergeSort {
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		int[] tmpArr = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) tmpArr[k++] = arr[i++];
			else tmpArr[k++] = arr[j++];
		}

		while (i <= mid) tmpArr[k++] = arr[i++];
		while (j <= right) tmpArr[k++] = arr[j++];

		for (i = left, k = 0; i <= right; i++, k++) {
			arr[i] = tmpArr[k];
		}
	}
}