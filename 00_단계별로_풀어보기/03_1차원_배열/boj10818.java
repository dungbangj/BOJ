import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj10818 {

    private static final Logger logger = Logger.getLogger(boj10818.class.getName());

    public static void main(String[] args) {
        try {
            int[] numbers = getInputData();
            String result = getResult(numbers);
            printOutput(result);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static int[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
            return numbers;
        }
    }

    private static String getResult(int[] numbers) {
        StringBuilder sb = new StringBuilder();

		int min = numbers[0];
		int max = numbers[0];

		for (int num : numbers) {
			if (num < min) min = num;
			if (num > max) max = num;
		}
        return sb.append(min).append(" ").append(max).append("\n").toString();
    }

	
    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
        }
    }
}
