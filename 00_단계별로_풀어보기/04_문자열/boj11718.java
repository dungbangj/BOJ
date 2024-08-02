import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj11718 {

	private static final Logger logger = Logger.getLogger(boj11718.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(makeResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static List<String> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<String> words = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
				line = line.strip();
				if (isInputExists(line)) {
					words.add(line);
				} else {
					break;
				}
			}
			return words;
		}
	}

	private static boolean isInputExists(String line) {
		return line != null && !line.isEmpty();
	}

	private static String makeResult(List<String> words) {
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word).append("\n");
		}
		return sb.toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
		}
	}
}
