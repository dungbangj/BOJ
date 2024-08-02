import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj2562 {

    private static final Logger logger = Logger.getLogger(boj2562.class.getName());

    public static void main(String[] args) {
        try {
            int[] nums = getInputData();
            String result = getResult(nums);
            printOutput(result);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static int[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] nums = new int[9];
            for (int i = 0; i < 9; i++) {
				nums[i] = Integer.parseInt(br.readLine().strip());
			}
            return nums;
        }
    }

    private static String getResult(int[] nums) {
        StringBuilder sb = new StringBuilder();

		int max = nums[0];
		int idx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				idx = i;
			}
		}
        return sb.append(max).append("\n").append(idx + 1).toString();
    }

	
    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
        }
    }
}
