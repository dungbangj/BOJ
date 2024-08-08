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

public class boj1085 {
	
	private static final Logger logger = Logger.getLogger(boj1085.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Arrays.stream(br.readLine().split(" "))
						 .mapToInt(Integer::parseInt)
						 .toArray();
		}
	}

	private static String getResult(int[] inputData) {
		int minVal = Integer.MAX_VALUE;
		int x = inputData[0];
		int y = inputData[1];
		int w = inputData[2];
		int h = inputData[3];

		for (int dist : new int[] {x, y, w - x, h - y}) {
			if (minVal > dist) minVal = dist;
		}
		return String.valueOf(minVal);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}