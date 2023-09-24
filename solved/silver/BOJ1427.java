import java.io.*;
import java.util.Arrays;

public class BOJ1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] inputNum = br.readLine().toCharArray();
		int[] nums = new int[inputNum.length];

		for (int i = 0; i < inputNum.length; i++) {
			nums[i] = inputNum[i] - '0';
		}

		selectionSort(nums);

		for (int i = nums.length - 1; i >= 0; i--) {
			bw.write(String.valueOf(nums[i]));
		}
		bw.flush();
		bw.close();
	}

	static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int minIdx = i;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIdx]) minIdx = j;
			}

			int tmp = nums[i];
			nums[i] = nums[minIdx];
			nums[minIdx] = tmp;
		}
	}
}
