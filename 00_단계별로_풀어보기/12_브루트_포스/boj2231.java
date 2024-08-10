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

public class boj2231 {
	
	private static final Logger logger = Logger.getLogger(boj2231.class.getName());

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
		int start = Math.max(1, inputData - 9 * String.valueOf(inputData).length());

		for (int i = start; i <= 1_000_000; i++) {
			if (getSplitSum(i) == inputData) return String.valueOf(i);
		}
		return "0";
	}

	private static int getSplitSum(int num) {
		char[] numChar = String.valueOf(num).toCharArray();
		int tmpSum = 0;
		for (int i = 0; i < numChar.length; i++) {
			tmpSum += (numChar[i] - '0');
		}
		return tmpSum + num;
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}