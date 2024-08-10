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
			getInputData();
			printOutput(getResult());
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static void getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine().strip();
		}
	}

	private static String getResult() {
		StringBuilder result = new StringBuilder();

		result.append("1").append("\n").append("0");
		return result.toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}