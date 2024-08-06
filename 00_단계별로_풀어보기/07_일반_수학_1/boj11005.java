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

public class boj11005 {

	private static final Logger logger = Logger.getLogger(boj11005.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(changeBase(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static List<Object> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] inputs = br.readLine().split(" ");
			BigInteger N = new BigInteger(inputs[0].strip());
			int formation = Integer.parseInt(inputs[1].strip());

			List<Object> inputData = new ArrayList<>();
			inputData.add(N);
			inputData.add(formation);
			return inputData;
		}
	}

	private static String changeBase(List<Object> inputData) {
		BigInteger N = (BigInteger) inputData.get(0);
		int formation = (int) inputData.get(1);
		BigInteger base = new BigInteger(String.valueOf(formation));
		
		StringBuilder baseChange = new StringBuilder();

		while (N.compareTo(BigInteger.ZERO) > 0) {
			BigInteger[] divmod = N.divideAndRemainder(base);
			baseChange.insert(0, getChar(divmod[1].intValue()));
			N = divmod[0];
		}
		return baseChange.toString();
	}

	private static char getChar(int num) {
		if (0 <= num && num <= 9) return (char)(num + '0');
		if (10 <= num && num <= 35) return (char)(num + 'A' - 10);
		throw new IllegalArgumentException("Invalid character in input: " + num);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
