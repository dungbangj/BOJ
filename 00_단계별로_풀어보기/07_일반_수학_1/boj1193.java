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

public class boj1193 {

	private static final Logger logger = Logger.getLogger(boj1193.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getDistance(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Integer.parseInt(br.readLine().strip());
		}
	}

	private static String getDistance(int inputData) {
		int distance = 1;
		int move = 1;

		while (move < inputData) {
			move += ++distance;
		}
		return getFraction(move - inputData, distance);
	}

	private static String getFraction(int offset, int distance) {
		if (distance % 2 == 0) {
			int top = distance - offset;
			int bottom = distance - top + 1;
			return new StringBuilder().append(top).append("/").append(bottom).toString();
		} else {
			int bottom = distance - offset;
			int top = distance - bottom + 1;
			return new StringBuilder().append(top).append("/").append(bottom).toString();
		}
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
