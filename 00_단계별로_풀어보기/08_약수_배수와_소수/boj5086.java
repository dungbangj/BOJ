import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj5086 {
	
	private static final Logger logger = Logger.getLogger(boj5086.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static List<int[]> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<int[]> inputData = new ArrayList<>();
			while (true) {
				int[] inputs = Arrays.stream(br.readLine().split(" "))
									 .mapToInt(Integer::parseInt)
									 .toArray();
				if (inputs[0] == 0 && inputs[1] == 0) break;
				inputData.add(inputs);

			}
			return inputData;
		}
	}

	private static String getResult(List<int[]> inputData) {
		StringBuilder results = new StringBuilder();

		for (int[] data : inputData) {
			if (data[0] % data[1] == 0) results.append("multiple");
			else if (data[1] % data[0] == 0) results.append("factor");
			else results.append("neither");
			results.append("\n");
		}
		return results.toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}