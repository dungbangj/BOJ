import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class boj10809 {

    private static final Logger logger = Logger.getLogger(boj10809.class.getName());

    public static void main(String[] args) {
        try {
            printOutput(countAlpha(getInputData()));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static char[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return br.readLine().strip().toCharArray();
        }
    }

	private static String countAlpha(char[] word) {
		int[] alphaCount = new int[26];
		Arrays.fill(alphaCount, -1);
		for (int i = 0; i < word.length; i++) {
			if (alphaCount[word[i] - 'a'] == -1) 
				alphaCount[word[i] - 'a'] = i;
		}
		return Arrays.toString(alphaCount).replaceAll("[\\[\\],]", "");
	}

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}
