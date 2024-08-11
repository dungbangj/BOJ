import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj2839 {

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
		int minCount = Integer.MAX_VALUE;

		for (int i = 0; i <= inputData; i += 5) {
			int count = 0;
			int tmpWeight = inputData;

			count += i / 5;
			tmpWeight -= i;

			if (tmpWeight % 3 == 0) {
				count += tmpWeight / 3;
				if (minCount > count) minCount = count;
			}
		}
		if (minCount == Integer.MAX_VALUE) minCount = -1;
		return String.valueOf(minCount);
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
