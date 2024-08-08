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

public class boj1978 {
	
	private static final Logger logger = Logger.getLogger(boj1978.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			int[] inputs = Arrays.stream(br.readLine().split(" "))
									.mapToInt(Integer::parseInt)
									.toArray();
			return inputs;
		}
	}

	private static String getResult(int[] inputData) {
		boolean[] sieveOfEratosthenes = getEratosthenes(getMaxValue(inputData));
		int primeCount = 0;

		for (int num : inputData) {
			if (sieveOfEratosthenes[num]) primeCount++;
		}
		return String.valueOf(primeCount);
	}

	private static int getMaxValue(int[] inputData) {
		int maxVal = inputData[0];

		for (int one : inputData) {
			if (maxVal < one) maxVal = one;
		}
		return maxVal;
	}

	private static boolean[] getEratosthenes(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}