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

public class boj19532 {
	
	private static final Logger logger = Logger.getLogger(boj19532.class.getName());

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

		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (inputData[0] * i + inputData[1] * j == inputData[2] &&
					inputData[3] * i + inputData[4] * j == inputData[5])
					return new StringBuilder().append(i).append(" ").append(j).toString();
			}
		}
		return "";
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}