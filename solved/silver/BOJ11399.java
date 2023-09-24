import java.io.*;
import java.util.Arrays;

public class BOJ11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		insertionSort(inputNums);

		int sum = 0;
		int sumAccum = 0;
		for (int num : inputNums) {
			sum += num;
			sumAccum += sum;
		}
		bw.write(sumAccum + "\n");
		bw.flush();
		bw.close();
	}

	static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int key = nums[i];
			int j = i - 1;

			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j--];
			}

			nums[j + 1] = key;
		}
	}
}
