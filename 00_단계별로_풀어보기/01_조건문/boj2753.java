import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj2753 {

	private static final Logger logger = Logger.getLogger(boj2753.class.getName());

	public static void main(String[] args) {
		printOutput(isLeapYear(getInputs()));
	}

	private static int getInputs() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Integer.parseInt(br.readLine());
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input!", e);
		}
		return -1;
	}

	private static void printOutput(int result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result + "\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output!", e);
		}
	}

	private static int isLeapYear(int input) {
		return input % 4 == 0 && (input % 100 != 0 || input % 400 == 0) ? 1 : 0 ;
	}
}