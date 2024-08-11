import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj1436 {

	public static void main(String[] args) {
		try {
			String result = findNumber(getInputData());
			printOutput(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Integer.parseInt(br.readLine().strip());
		}
	}

	private static String findNumber(int inputData) {
		int count = 0;
		int number = 665;

		while (count < inputData) {
			number++;
			if (contains666(number)) count++;
		}
		return String.valueOf(number);
	}

	private static boolean contains666(int number) {
		while (number >= 666) {
			if (number % 1000 == 666) return true;
			number /= 10;
		}
		return false;
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
