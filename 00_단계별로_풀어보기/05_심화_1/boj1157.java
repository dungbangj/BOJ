import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;


public class boj1157 {
	
	private static final Logger logger = Logger.getLogger(boj1157.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getFrequentAlpha(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static String getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return br.readLine().strip();
		}
	}

	private static String getFrequentAlpha(String inputData) {
		char[] inputChar = inputData.toCharArray();
		int[] alphaCounts = new int[26];

		for (char one : inputChar) {
			if ('a' <= one && one <= 'z')
				alphaCounts[one - 32 - 65]++;
			else alphaCounts[one - 65]++;
		}
		int maxVal = getMaxVal(alphaCounts);
		int maxValCount = getMaxValCount(alphaCounts, maxVal);
		
		if (maxValCount > 1) return "?";
		return String.valueOf((char)(getFrequentIdx(alphaCounts, maxVal) + 65));
	}

	private static int getFrequentIdx(int[] alphaCounts, int maxVal) {
		for (int i = 0; i < 26; i++) {
			if (maxVal == alphaCounts[i]) {
				return i;
			}
		}
		return 0;
	}

	private static int getMaxVal(int[] alphaCounts) {
		int maxVal = alphaCounts[0];
		
		for (int i = 0; i < 26; i++) {
			if (maxVal < alphaCounts[i]) {
				maxVal = alphaCounts[i];
			}
		}
		return maxVal;
	}

	private static int getMaxValCount(int[] alphaCounts, int maxVal) {
		int count = 0;

		for (int i = 0; i < 26; i++) {
			if (maxVal == alphaCounts[i]) {
				count++;
			}
		}
		return count;
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			bw.newLine();
		}
	}
}