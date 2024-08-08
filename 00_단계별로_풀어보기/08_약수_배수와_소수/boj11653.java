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

public class boj11653 {
	
	private static final Logger logger = Logger.getLogger(boj11653.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Integer.parseInt(br.readLine().strip());
		}
	}

	private static String getResult(int inputData) {
		List<Integer> factors = getFactors(inputData);
		StringBuilder result = new StringBuilder();

		for (int factor : factors) {
			result.append(factor).append("\n");
		}
		return result.toString();
	}

	private static List<Integer> getFactors(int num) {
		List<Integer> factors = new ArrayList<>();

		while (num % 2 == 0) {
			factors.add(2);
			num /= 2;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			while (num % i == 0) {
				factors.add(i);
				num /= i;
			}
		}

		if (num > 2) {
			factors.add(num);
		}
		return factors;
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}