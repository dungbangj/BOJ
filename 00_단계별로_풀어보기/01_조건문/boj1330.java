import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj1330 {

	private static final Logger logger = Logger.getLogger(boj1330.class.getName());

	public static void main(String[] args) {
		printOutput(compInputs(getInputs()));
	}

	private static int[] getInputs() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] inputs = Arrays.stream(br.readLine().split(" "))
								.mapToInt(Integer::parseInt)
								.toArray();
			return inputs;
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input!", e);
		}
		return new int[0];
	}

	private static void printOutput(String result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output!", e);
		}
	}

	private static String compInputs(int[] inputs) {
		if (inputs[0] > inputs[1]) return ">";
		else if (inputs[0] < inputs[1]) return "<";
		return "==";
	}
}