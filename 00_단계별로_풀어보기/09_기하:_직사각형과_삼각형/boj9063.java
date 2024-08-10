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

public class boj9063 {
	
	private static final Logger logger = Logger.getLogger(boj9063.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[][] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine().strip());
			int[][] inputData = new int[N][2];

			for (int i = 0; i < N; i++) {
				inputData[i] = Arrays.stream(br.readLine().split(" "))
							   .mapToInt(Integer::parseInt)
							   .toArray();
			}
			return inputData;
		}
	}

	private static String getResult(int[][] inputData) {
		if (inputData.length <= 1) return "0";
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
		
		for (int[] one : inputData) {
			int oneX = one[0];
			int oneY = one[1];

			if (minX > oneX) minX = oneX;
			if (maxX < oneX) maxX = oneX;
			if (minY > oneY) minY = oneY;
			if (maxY < oneY) maxY = oneY;
		}
		return String.valueOf((maxX - minX) * (maxY - minY));
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
