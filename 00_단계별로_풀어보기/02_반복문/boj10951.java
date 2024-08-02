import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class boj10951 {
	
	private static final Logger logger = Logger.getLogger(boj10951.class.getName());

	public static void main(String[] args) {
		printOutput(getMultiTable(getInput()));
	}

	private static List<int[]> getInput() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<int[]> inputs = new ArrayList<>();

			while (true) {
				String line = br.readLine();
				if (isInputDone(line)) break;
				int[] AB = Arrays.stream(line.split(" "))
								.mapToInt(Integer::parseInt)
								.toArray();
				inputs.add(AB);
			}
			return inputs;
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input!", e);
		}
		return new ArrayList<>();
	}

	private static boolean isInputDone(String line) {
		return line == null || line.trim().isEmpty();
	}

	private static void printOutput(String result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result + "\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to print output!", e);
		}
	}

	private static String getMultiTable(List<int[]> inputs) {
		StringBuilder sb = new StringBuilder();
		for (int[] AB : inputs) {
			sb.append(AB[0] + AB[1]).append("\n");
		}
		return sb.toString();
	}
}