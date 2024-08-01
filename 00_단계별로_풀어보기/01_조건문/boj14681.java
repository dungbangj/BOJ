import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj14681 {

	private static final Logger logger = Logger.getLogger(boj14681.class.getName());

	public static void main(String[] args) {
		printOutput(calQuadrant(getInputs()));
	}

	private static int[] getInputs() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			return new int[] {x, y};
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

	private static int calQuadrant(int[] inputs) {
		if (0 < inputs[0]) {
			if (0 < inputs[1]) return 1;
			return 4;
		} else {
			if (0 < inputs[1]) return 2;
			return 3;
		}
	}
}