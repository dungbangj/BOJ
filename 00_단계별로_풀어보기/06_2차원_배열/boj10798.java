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

public class boj10798 {

	private static final Logger logger = Logger.getLogger(boj10798.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to oerate input/output", e);
		}
	}

	private static char[][] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[][] inputData = initArray();
			for (int i = 0; i < 5; i++) {
				char[] tmpInput = br.readLine().toCharArray();
				for (int j = 0; j < tmpInput.length; j++) {
					inputData[i][j] = tmpInput[j];
				}
			}

			return inputData;
		}
	}

	private static char[][] initArray() {
		char[][] result = new char[5][15];

		for (char[] row : result) {
			Arrays.fill(row, '-');
		}
		return result;
	}

	private static String getResult(char[][] inputData) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < inputData[0].length; i++) {
			for (int j = 0; j < inputData.length; j++) {
				if (inputData[j][i] != '-') sb.append(inputData[j][i]);
			}
		}
		return sb.toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}