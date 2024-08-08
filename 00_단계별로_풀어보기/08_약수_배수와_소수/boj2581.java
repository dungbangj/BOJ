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

public class boj2581 {
	
	private static final Logger logger = Logger.getLogger(boj2581.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static int[] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int min = Integer.parseInt(br.readLine().strip());
			int max = Integer.parseInt(br.readLine().strip());
			return new int[] {min, max};
		}
	}

	private static String getResult(int[] inputData) {
		boolean[] sieveOfEratosthenes = getEratosthenes(inputData[1]);
		int minPrime = -1;
		int primeSum = 0;

		for (int i = inputData[0]; i <= inputData[1]; i++) {
			if (sieveOfEratosthenes[i]) {
				if (primeSum == 0) minPrime = i;
				primeSum += i;
			}
		}
		if (minPrime == -1) return "-1";
		return new StringBuilder().append(primeSum).append("\n").append(minPrime).toString();
	}

	private static boolean[] getEratosthenes(int max) {
		boolean[] isPrime = new boolean[max + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i * i <= max; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= max; j += i) {
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