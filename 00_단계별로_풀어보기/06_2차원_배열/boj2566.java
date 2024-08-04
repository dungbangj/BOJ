import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj2566 {

	private static final Logger logger = Logger.getLogger(boj2566.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getMaxVal(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to oerate input/output", e);
		}
	}

	private static int[][] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[][] inputData = new int[9][9];
			for (int i = 0; i < 9; i++) {
				inputData[i] = Arrays.stream(br.readLine().split(" "))
									.mapToInt(Integer::parseInt)
									.toArray();
			}
			return inputData;
		}
	}

	private static String getMaxVal(int[][] inputData) {
		int maxVal = inputData[0][0];
		int x = 1;
		int y = 1;

		for (int i = 0; i < inputData.length; i++) {
			for (int j = 0; j < inputData[i].length; j++) {
				if (maxVal < inputData[i][j]) {
					maxVal = inputData[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		return new StringBuilder().append(maxVal).append("\n").append(x).append(" ").append(y).toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}