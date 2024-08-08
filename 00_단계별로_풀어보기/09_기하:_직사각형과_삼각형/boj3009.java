import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj3009 {
	
	private static final Logger logger = Logger.getLogger(boj3009.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[][] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[][] inputData = new int[3][2];
			for (int i = 0; i < 3; i++) {
				inputData[i] = Arrays.stream(br.readLine().split(" "))
									 .mapToInt(Integer::parseInt)
									 .toArray();
			}
			return inputData;
		}
	}

	private static String getResult(int[][] inputData) {
		StringBuilder result = new StringBuilder();
		for (int j = 0; j < 2; j++) {
			Set<Integer> nums = new HashSet<>();
			for (int i = 0; i < inputData.length; i++) {
				if (nums.contains(inputData[i][j])) nums.remove(inputData[i][j]);
				else nums.add(inputData[i][j]);
			}
			for (int num : nums) {
				result.append(num).append(" ");
			}
		}
		return result.toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}