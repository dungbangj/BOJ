import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class boj5622 {

    private static final Logger logger = Logger.getLogger(boj5622.class.getName());

    public static void main(String[] args) {
        try {
            printOutput(String.valueOf(getResult(getInputData())));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static char[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return br.readLine().strip().toCharArray();
        }
    }

	private static String getResult(char[] word) {
		int sum = 0;
		for (char oneChar : word) {
			if ('A' <= oneChar && oneChar <= 'C') sum += 2;
			else if ('D' <= oneChar && oneChar <= 'F') sum += 3;
			else if ('G' <= oneChar && oneChar <= 'I') sum += 4;
			else if ('J' <= oneChar && oneChar <= 'L') sum += 5;
			else if ('M' <= oneChar && oneChar <= 'O') sum += 6;
			else if ('P' <= oneChar && oneChar <= 'S') sum += 7;
			else if ('T' <= oneChar && oneChar <= 'V') sum += 8;
			else if ('W' <= oneChar && oneChar <= 'Z') sum += 9;
		}
		return String.valueOf(sum + word.length);
	}

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}