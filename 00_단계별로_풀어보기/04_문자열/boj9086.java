import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class boj9086 {

    private static final Logger logger = Logger.getLogger(boj9086.class.getName());

    public static void main(String[] args) {
        try {
            printOutput(getStartEnd(getInputData()));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static String[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int operationCount = Integer.parseInt(br.readLine().strip());
			String[] words = new String[operationCount];
			for (int i = 0; i < operationCount; i++) {
				words[i] = br.readLine();
			}
			return words;
        }
    }

	private static String getStartEnd(String[] words) {
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word.charAt(0)).append(word.charAt(word.length() - 1)).append("\n");
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
