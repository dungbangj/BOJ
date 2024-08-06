import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj2869 {

	private static final Logger logger = Logger.getLogger(boj2869.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getDays(getInputData()));
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

	private static String getDays(int[] inputData) {
		int up = inputData[0];
		int down = inputData[1];
		int totalLength = inputData[2];
		int netUp = up - down;
		int daysNeeded = (totalLength - up + netUp - 1) / netUp;
		return String.valueOf(daysNeeded + 1);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
