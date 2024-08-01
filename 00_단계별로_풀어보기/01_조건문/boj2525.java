import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj2525 {

	private static final Logger logger = Logger.getLogger(boj2525.class.getName());

	public static void main(String[] args) {
		printOutput(getTime(getInputs()));
	}

	private static int[] getInputs() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] now = Arrays.stream(br.readLine().split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
			int time = Integer.parseInt(br.readLine());
			return new int[] {now[0], now[1], time};
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input!", e);
		}
		return new int[0];
	}

	private static void printOutput(int[] result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result[0] + " " + result[1] + "\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output!", e);
		}
	}

	private static int[] getTime(int[] inputs) {
		int hour = inputs[0];
		int min = inputs[1];

		min += inputs[2];
		while (min >= 60) {
			hour += 1;
			min -= 60;
		}
		if (hour >= 24) hour -= 24;
		return new int[] {hour, min};
	}
}