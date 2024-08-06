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

public class boj2745 {

	private static final Logger logger = Logger.getLogger(boj2745.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(getResult(getInputData()).toString());
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to operate input/output!", e);
		}
	}

	private static List<Object> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] inputs = br.readLine().split(" ");
			char[] N = inputs[0].strip().toCharArray();
			int formation = Integer.parseInt(inputs[1].strip());

			List<Object> inputData = new ArrayList<>();
			inputData.add(N);
			inputData.add(formation);
			return inputData;
		}
	}

	private static BigInteger getResult(List<Object> inputData) {
		char[] N = (char[]) inputData.get(0);
		int formation = (int) inputData.get(1);
		BigInteger result = BigInteger.ZERO;
		BigInteger mul = BigInteger.ONE;

		for (int i = N.length - 1; i >= 0; i--) {
			result = result.add(BigInteger.valueOf(getNum(N[i])).multiply(mul));
			mul = mul.multiply(BigInteger.valueOf(formation));
		}
		return result;
	}

	private static int getNum(char num) {
		if ('0' <= num && num <= '9') return num - '0';
		if ('A' <= num && num <= 'Z') return num - 'A' + 10;
		throw new IllegalArgumentException("Invalid character in input: " + num);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
