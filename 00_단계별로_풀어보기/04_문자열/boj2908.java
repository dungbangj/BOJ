import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class boj2908 {

    private static final Logger logger = Logger.getLogger(boj2908.class.getName());

    public static void main(String[] args) {
        try {
            printOutput(String.valueOf(getBigNum(getInputData())));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static int[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			return Arrays.stream(br.readLine().split(" "))
						 .mapToInt(Integer::parseInt)
						 .toArray();
        }
    }

	private static int getBigNum(int[] inputData) {
		int a = getReverseNum(inputData[0]);
		int b = getReverseNum(inputData[1]);
		return a > b ? a : b;
	}

	private static int getReverseNum(int num) {
		int a = num / 100;
		int b = (num - (a * 100)) / 10;
		int c = num % 10;
		return c * 100 + b * 10 + a;
	}

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}