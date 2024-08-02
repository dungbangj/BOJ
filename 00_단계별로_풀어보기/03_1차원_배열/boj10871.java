import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj10871 {

    private static final Logger logger = Logger.getLogger(boj10871.class.getName());

    public static void main(String[] args) {
        try {
            InputData inputData = getInputData();
            String result = countOccurrences(inputData);
            printOutput(result);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static InputData getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int targetNumber = Arrays.stream(br.readLine().split(" "))
									.mapToInt(Integer::parseInt)
									.toArray()[1];
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
            return new InputData(targetNumber, numbers);
        }
    }

    private static String countOccurrences(InputData inputData) {
        StringBuilder sb = new StringBuilder();
		int targetNumber = inputData.getTargetNumber();

        for (int number : inputData.getNumbers()) {
            if (number < targetNumber) sb.append(number).append(" ");
        }
        return sb.toString().strip();
    }

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}

class InputData {
    private final int targetNumber;
    private final int[] numbers;

    public InputData(int targetNumber, int[] numbers) {
        this.targetNumber = targetNumber;
        this.numbers = numbers;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
