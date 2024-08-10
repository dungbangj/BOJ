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

public class boj14215 {
	
	private static final Logger logger = Logger.getLogger(boj14215.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Arrays.stream(br.readLine().split(" "))
						 .mapToInt(Integer::parseInt)
						 .toArray();
		}
	}

	private static String getResult(int[] inputData) {
		int lineSum = inputData[0] + inputData[1] + inputData[2];
		int maxLine = Math.max(inputData[0], Math.max(inputData[1], inputData[2]));
		int result = lineSum;

		if (maxLine >= lineSum - maxLine) return String.valueOf((lineSum - maxLine) * 2 - 1);
		return String.valueOf(result); 
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}