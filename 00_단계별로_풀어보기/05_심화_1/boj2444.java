import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;


public class boj2444 {
	
	private static final Logger logger = Logger.getLogger(boj2444.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(drawStars(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static int getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Integer.parseInt(br.readLine().strip());
		}
	}

	private static String drawStars(int inputData) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < inputData; i++) {
			int starCount = (i + 1) * 2 - 1;
			int spaceCount = inputData - (i + 1);
			sb.append(" ".repeat(spaceCount)).append("*".repeat(starCount)).append("\n");
		}
		for (int i = inputData - 2; i >= 0; i--) {
			int starCount = (i + 1) * 2 - 1;
			int spaceCount = inputData - (i + 1);
			sb.append(" ".repeat(spaceCount)).append("*".repeat(starCount)).append("\n");
		}
		return sb.toString();
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			// bw.newLine();
		}
	}
}