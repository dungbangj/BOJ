import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.math.BigInteger;

public class boj2798 {
	
	private static final Logger logger = Logger.getLogger(boj2798.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static List<Object> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<Object> inputData = new ArrayList<>();

			for (int i = 0; i < 2; i++) {
				inputData.add(
					Arrays.stream(br.readLine().split(" "))
						  .mapToInt(Integer::parseInt)
						  .toArray()
				);
			}
			return inputData;
		}
	}

	private static String getResult(List<Object> inputData) {
		int dest = ((int[]) inputData.get(0))[1];
		int[] nums = (int[]) inputData.get(1);
		Arrays.sort(nums);
		int len = nums.length;
		int maxVal = 0;

		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					int tmpSum = nums[i] + nums[j] + nums[k];
					if (tmpSum > dest) break;
					if (tmpSum <= dest && maxVal < tmpSum) maxVal = tmpSum;
					if (maxVal == dest) return String.valueOf(maxVal);
				}
			}
		}
		return String.valueOf(maxVal);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}