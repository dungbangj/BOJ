import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj2438 {
	
	private static final Logger logger = Logger.getLogger(boj2438.class.getName());

	public static void main(String[] args) {
		printOutput(getStarTower(getInput()));
	}

	private static int getInput() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Integer.parseInt(br.readLine().strip());
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input!", e);
		}
		return -1;
	}

	private static void printOutput(String result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to print output!", e);
		}
	}

	private static String getStarTower(int input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= input; i++) {
			sb.append("*".repeat(i)).append("\n");
		}
		return sb.toString();
	}
}