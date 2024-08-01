import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj9498 {

	private static final Logger logger = Logger.getLogger(boj9498.class.getName());

	public static void main(String[] args) {
		printOutput(calGrade(getInputs()));
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
			bw.write(result);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output!", e);
		}
	}

	private static char calGrade(int input) {
		if (90 <= input && input <= 100) return 'A';
		else if (80 <= input && input <= 89) return 'B';
		else if (70 <= input && input <= 79) return 'C';
		else if (60 <= input && input <= 69) return 'D';
		return 'F';
	}
}