import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class boj1316 {
	
	private static final Logger logger = Logger.getLogger(boj1316.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(countGroupWord(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static String[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int wordCount = Integer.parseInt(br.readLine().strip());
			String[] words = new String[wordCount];
			for (int i = 0; i < wordCount; i++) {
				words[i] = br.readLine().strip();
			}
			return words;
		}
	}

	private static String countGroupWord(String[] words) {
		int count = 0;
		for (String word : words) {
			if (isGroupWord(word)) count++;
		}
		return String.valueOf(count);
	}

	private static boolean isGroupWord(String word) {
		char[] wordChar = word.toCharArray();

		Set<Character> wordPocket = new HashSet<>();
		for (int i = 0; i < wordChar.length; i++) {
			if (!wordPocket.contains(wordChar[i])) wordPocket.add(wordChar[i]);
			else {
				if (wordChar[i] != wordChar[i - 1]) return false;
			}
		}
		return true;
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			bw.newLine();
		}
	}
}