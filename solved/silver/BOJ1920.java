import java.io.*;
import java.util.*;

public class BOJ1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] inputFirstArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int M = Integer.parseInt(br.readLine());
		int[] inputSecondArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(inputFirstArr);

		for (int oneEle : inputSecondArr) {
			if (binarySearch(inputFirstArr, oneEle) != -1) {
				sb.append(1 + "\n");
			} else {
				sb.append(0 + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static int binarySearch(int[] inputArr, int key) {
		int start = 0;
		int end = inputArr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (key < inputArr[mid]) {
				end = mid - 1;
			} else if (key > inputArr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
