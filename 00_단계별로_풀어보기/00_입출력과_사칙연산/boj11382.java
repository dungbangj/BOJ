import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj11382 {
	
	private static final Logger logger = Logger.getLogger(boj11382.class.getName());

	public static void main(String[] args) {
		printOutput(sum(getInputs()));
	}

	private static long[] getInputs() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Arrays.stream(br.readLine().split(" "))
						.mapToLong(Long::parseLong)
						.toArray();
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input", e);
		}
		return new long[0];
	}

	private static void printOutput(long result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result + "\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output", e);
		}
	}

	private static long sum(long[] inputs) {
		return Arrays.stream(inputs).sum();
	}
}
