import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj2720 {

	private static final Logger logger = Logger.getLogger(boj2720.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(calRemain(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int T = Integer.parseInt(br.readLine());
			int[] inputData = new int[T];

			for (int i = 0; i < T; i++) {
				inputData[i] = Integer.parseInt(br.readLine().strip());
			}
			return inputData;
		}
	}

	private static String calRemain(int[] inputData) {
		StringBuilder sb = new StringBuilder();
		int[] units = new int[] {25, 10, 5, 1};

		for (int oneData : inputData) {
			for (int unit : units) {
				sb.append(oneData / unit).append(" ");
				oneData %= unit;
			}
			sb.append("\n");
		}

		return sb.toString();
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
