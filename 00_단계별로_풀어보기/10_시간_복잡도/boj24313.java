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
import java.math.BigInteger;

public class boj24313 {
	
	private static final Logger logger = Logger.getLogger(boj24313.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static List<Object> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<Object> inputData = new ArrayList<>();

			inputData.add(
				Arrays.stream(br.readLine().split(" "))
					  .mapToInt(Integer::parseInt)
					  .toArray()
			);
			inputData.add(Integer.parseInt(br.readLine().strip()));
			inputData.add(Integer.parseInt(br.readLine().strip()));
			return inputData;
		}
	}

	private static String getResult(List<Object> inputData) {
		int[] fn = (int[]) inputData.get(0);
		int c = (int) inputData.get(1);
		int n = (int) inputData.get(2);

		for (int i = n; i <= 100; i++) {
			int fnResult = fn[0] * i + fn[1];
			int gnResult = c * i;
			
			if (fnResult > gnResult) return "0";
		}
		return "1";
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}