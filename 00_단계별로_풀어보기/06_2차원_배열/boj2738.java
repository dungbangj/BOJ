import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj2738 {

	private static final Logger logger = Logger.getLogger(boj2738.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(sumTwoArrays(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to oerate input/output", e);
		}
	}

	private static List<int[][]> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<int[][]> twoArrays = new ArrayList<>();
			String[] inputNM = br.readLine().split(" ");
			int N = Integer.parseInt(inputNM[0]);
			int M = Integer.parseInt(inputNM[1]);

			for (int i = 0; i < 2; i++) {
				int[][] tmpInput = new int[N][M];
				for (int j = 0; j < N; j++) {
					tmpInput[j] = Arrays.stream(br.readLine().split(" "))
										.mapToInt(Integer::parseInt)
										.toArray();
				}
				twoArrays.add(tmpInput);
			}
			return twoArrays;
		}
	}

	private static String sumTwoArrays(List<int[][]> twoArrays) {
		int[][] result = new int[twoArrays.get(0).length][twoArrays.get(0)[0].length];

		for (int[][] tmpArray : twoArrays) {
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] += tmpArray[i][j];
				}
			}
		}
		return makeArrToString(result);
	}

	private static String makeArrToString(int[][] result) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				sb.append(result[i][j]).append(" ");
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