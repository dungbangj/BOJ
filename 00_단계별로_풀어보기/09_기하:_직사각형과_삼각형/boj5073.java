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

public class boj5073 {
	
	private static final Logger logger = Logger.getLogger(boj5073.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static List<int[]> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<int[]> inputData = new ArrayList<>();

			while (true) {
				int[] input = Arrays.stream(br.readLine().split(" "))
									.mapToInt(Integer::parseInt)
									.toArray();
				if (input[0] == 0 && input[1] == 0 && input[2] == 0) return inputData;
				inputData.add(input);
			}
		}
	}

	private static String getResult(List<int[]> inputData) {
		StringBuilder result = new StringBuilder();

		for (int[] oneData : inputData) {
			int a = oneData[0];
			int b = oneData[1];
			int c = oneData[2];

			int maxLine = Math.max(a, Math.max(b, c));
			int sum = a + b + c;

			if (maxLine >= sum - maxLine) result.append("Invalid");
			else if (a == b && b == c) result.append("Equilateral");
			else if (a == b || b == c || c == a) result.append("Isosceles");
			else result.append("Scalene");
			result.append("\n");
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