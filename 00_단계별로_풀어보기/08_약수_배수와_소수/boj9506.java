import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj9506 {
	
	private static final Logger logger = Logger.getLogger(boj9506.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static List<Integer> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<Integer> inputs = new ArrayList<>();
			while (true) {
				int input = Integer.parseInt(br.readLine().strip());
				if (input == -1) break;
				inputs.add(input);
			}
			return inputs;
		}
	}

	private static String getResult(List<Integer> inputData) {
		StringBuilder results = new StringBuilder();

		for (int input : inputData) {
			List<Integer> divisors = getDivisors(input);
			results.append(input);
			if (input != getSum(divisors)) results.append(" is NOT perfect.");
			else {
				results.append(" = ").append(getSumStr(divisors));
			}
			results.append("\n");
		}
		return results.toString();
	}

	private static int getSum(List<Integer> divisors) {
		int sum = 0;
		for (int divisor : divisors) {
			sum += divisor;
		}
		return sum;
	}

	private static String getSumStr(List<Integer> divisors) {
		StringBuilder sumStr = new StringBuilder();
		for (int i = 0; i < divisors.size(); i++) {
			sumStr.append(divisors.get(i));
			if (i != divisors.size() - 1) sumStr.append(" + ");
		}
		return sumStr.toString();
	}

	private static List<Integer> getDivisors(int n) {
		List<Integer> divisors = new ArrayList<>();

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				divisors.add(i);
				if (i != 1 && i != n / i) divisors.add(n / i);
			}
		}
		Collections.sort(divisors);
		return divisors;
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}