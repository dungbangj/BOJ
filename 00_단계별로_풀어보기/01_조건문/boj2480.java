import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Math;

public class boj2480 {

	private static final Logger logger = Logger.getLogger(boj2480.class.getName());

	public static void main(String[] args) {
		printOutput(getScore(getInputs()));
	}

	private static int[] getInputs() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Arrays.stream(br.readLine().split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input!", e);
		}
		return new int[0];
	}

	private static void printOutput(int result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result + "\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output!", e);
		}
	}

	private static int getScore(int[] inputs) {
		int a = inputs[0];
		int b = inputs[1];
		int c = inputs[2];

		if (a == b && b == c) return 10000 + a * 1000;
		else if (a != b && b != c && a != c) return Math.max(a, Math.max(b, c)) * 100;
		return 1000 + getSameNum(a, b, c) * 100;
	}

	private static int getSameNum(int a, int b, int c) {
		if (a == b || a == c) return a;
		return c;
	}
}