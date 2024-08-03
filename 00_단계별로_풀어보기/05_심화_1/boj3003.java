import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;


public class boj3003 {
	
	private static final Logger logger = Logger.getLogger(boj3003.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(calRemains(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Arrays.stream(br.readLine().split(" "))
						 .mapToInt(Integer::parseInt)
						 .toArray();
		}
	}

	private static String calRemains(int[] inputData) {
		StringBuilder sb = new StringBuilder();
		int[] normalChessPieces = new int[] {1, 1, 2, 2, 2, 8};
		for (int i = 0; i < inputData.length; i++) {
			sb.append(String.valueOf(normalChessPieces[i] - inputData[i])).append(" ");
		}
		return sb.toString();
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			bw.newLine();
		}
	}
}