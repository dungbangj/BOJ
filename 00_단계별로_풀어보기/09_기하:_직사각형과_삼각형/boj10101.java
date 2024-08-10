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

public class boj10101 {
	
	private static final Logger logger = Logger.getLogger(boj10101.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] inputData = new int[3];
			for (int i = 0; i < 3; i++) {
				inputData[i] = Integer.parseInt(br.readLine().strip());
			}
			return inputData;
		}
	}

	private static String getResult(int[] inputData) {
		int triangleSum = Arrays.stream(inputData).sum();
		if (triangleSum != 180) return "Error";
		return getTriangleType(inputData);
	}

	private static String getTriangleType(int[] inputData) {
		int a = inputData[0];
		int b = inputData[1];
		int c = inputData[2];

		if (a == b && b == c) return "Equilateral";
		else if (a != b && b != c && c != a) return "Scalene";
		return "Isosceles";
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
