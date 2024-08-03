import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;


public class boj2941 {
	
	private static final Logger logger = Logger.getLogger(boj2941.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(countAlpha(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static String getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return br.readLine().strip();
		}
	}

	private static String countAlpha(String word) {
		char[] wordChar = word.toCharArray();
		char[] ref = new char[] {'c', 'd', 'l', 'n', 's', 'z'};
		int count = 0;

		for (int i = 0; i < wordChar.length; i++) {
			if (isInRef(wordChar[i], ref) && i < wordChar.length - 1) {
				if (wordChar[i] == 'c' && (wordChar[i + 1] == '=' || wordChar[i + 1] == '-')) {
					count++;
					i++;
				} else if (wordChar[i] == 'd') {
					if (wordChar[i + 1] == '-') {
						count++;
						i++;
					} else if (i < wordChar.length - 2 && wordChar[i + 1] == 'z' && wordChar[i + 2] == '=') {
						count++;
						i += 2;
					} else {
						count++;
					}
				} else if (wordChar[i + 1] == 'j' && (wordChar[i] == 'l' || wordChar[i] == 'n')) {
					count++;
					i++;
				} else if (wordChar[i + 1] == '=' && (wordChar[i] == 's' || wordChar[i] == 'z')) {
					count++;
					i++;
				} else {
					count++;
				}
			} else {
				count++;
			}
		}
		return String.valueOf(count);
	}

	private static boolean isInRef(char one, char[] ref) {
		for (char oneRef : ref) {
			if (one == oneRef) return true;
		}
		return false;
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			bw.newLine();
		}
	}
}