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

public class boj2903 {

	private static final Logger logger = Logger.getLogger(boj2903.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getDotsCount(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Integer.parseInt(br.readLine().strip());
		}
	}

	private static String getDotsCount(int inputData) {
		int oneLineDotCount = getOneLineDotsCount(inputData);
		return String.valueOf(oneLineDotCount * oneLineDotCount);
	}

	private static int getOneLineDotsCount(int N) {
		int dotCount = 2;

		for (int i = 0; i < N; i++) dotCount = dotCount * 2 - 1;
		return dotCount;
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
