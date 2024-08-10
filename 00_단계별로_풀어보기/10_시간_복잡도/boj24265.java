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

public class boj24265 {
	
	private static final Logger logger = Logger.getLogger(boj24265.class.getName());

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
		StringBuilder result = new StringBuilder();

		BigInteger num = new BigInteger(String.valueOf(inputData));
		BigInteger numMinusOne = new BigInteger(String.valueOf(inputData - 1));

		result.append(num.multiply(numMinusOne).divide(new BigInteger("2"))).append("\n").append(2);
		return result.toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}