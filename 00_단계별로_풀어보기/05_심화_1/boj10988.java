import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;


public class boj10988 {
	
	private static final Logger logger = Logger.getLogger(boj10988.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(isPalin(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static String getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return br.readLine().strip();
		}
	}

	private static String isPalin(String inputData) {
		StringBuilder sb = new StringBuilder(inputData);
		if (inputData.equals(sb.reverse().toString())) return "1";
		return "0";
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			bw.newLine();
		}
	}
}