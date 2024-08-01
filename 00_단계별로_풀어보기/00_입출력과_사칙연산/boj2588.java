import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj2588 {
	
	public static final Logger logger = Logger.getLogger(boj2588.class.getName());

	public static void main(String[] args) {
		printOutput(getMultiplies(getInputs()));
	}

	private static String[] getInputs() {
		String[] inputs = new String[2];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			inputs[0] = br.readLine().strip();
			inputs[1] = br.readLine().strip();
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input", e);
		} catch (NumberFormatException e) {
			logger.log(Level.WARNING, "Invalid number format", e);
		}
		return inputs;
	}

	private static void printOutput(int[] results) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			for (int result : results) bw.write(result + "\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output", e);
		}
	}

	private static int[] getMultiplies(String[] inputs) {
		int first = Integer.parseInt(inputs[0]);
		String second = inputs[1];
		int[] seconds = {second.charAt(0) - '0', second.charAt(1) - '0', second.charAt(2) - '0'};
		return new int[] {first * seconds[2], first * seconds[1], first * seconds[0], first * Integer.parseInt(second)};
	}
}
