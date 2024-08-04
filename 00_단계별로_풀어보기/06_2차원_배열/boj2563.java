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

public class boj2563 {

	private static final Logger logger = Logger.getLogger(boj2563.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(calPaperArea(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to oerate input/output", e);
		}
	}

	private static int[][] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int paperCount = Integer.parseInt(br.readLine().strip());
			int[][] inputData = new int[paperCount][2];

			for (int i = 0; i < paperCount; i++) {
				inputData[i] = Arrays.stream(br.readLine().split(" "))
									 .mapToInt(Integer::parseInt)
									 .toArray();
			}
			return inputData;
		}
	}

	private static String calPaperArea(int[][] inputData) {
		int[][] area = new int[100][100];

		for (int[] tcase : inputData) {
			int si = tcase[0];
			int sj = tcase[1];

			for (int i = sj; i < sj + 10; i++) {
				for (int j = si; j < si + 10; j++) {
					if (i < 100 && j < 100) area[i][j] = 1;
				}
			}
		}
		return getPaperArea(area);
	}

	private static String getPaperArea(int[][] area) {
		int count = 0;
		
		for (int i = 0; i < area.length; i++) {
			count += Arrays.stream(area[i]).sum();
		}
		return String.valueOf(count);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}