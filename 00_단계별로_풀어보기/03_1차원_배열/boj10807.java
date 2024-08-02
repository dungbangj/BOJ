import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj10807 {

    private static final Logger logger = Logger.getLogger(boj10807.class.getName());

    public static void main(String[] args) {
        try {
            InputData inputData = getInputData();
            int count = countOccurrences(inputData);
            printOutput(String.valueOf(count));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static InputData getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
            int targetNumber = Integer.parseInt(br.readLine());
            return new InputData(targetNumber, numbers);
        }
    }

    private static int countOccurrences(InputData inputData) {
        int count = 0;
        int targetNumber = inputData.getTargetNumber();
        for (int number : inputData.getNumbers()) {
            if (number == targetNumber) {
                count++;
            }
        }
        return count;
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
