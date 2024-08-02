import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class boj11720 {

    private static final Logger logger = Logger.getLogger(boj11720.class.getName());

    public static void main(String[] args) {
        try {
            printOutput(getSum(getInputData()));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static char[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			return br.readLine().strip().toCharArray();
        }
    }

	private static String getSum(char[] nums) {
		return String.valueOf(IntStream.range(0, nums.length)
									   .map(i -> Character.getNumericValue(nums[i]))
									   .sum());
	}

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}
