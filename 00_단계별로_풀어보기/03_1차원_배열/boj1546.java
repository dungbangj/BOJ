import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj1546 {

    private static final Logger logger = Logger.getLogger(boj1546.class.getName());

    public static void main(String[] args) {
        try {
            String result = getAverage(getInputData());
            printOutput(result);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static int[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            int[] scores = Arrays.stream(br.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
            return scores;
        }
    }

    private static String getAverage(int[] nums) {
        StringBuilder sb = new StringBuilder();

        int maxVal = nums[0];
		for (int num : nums) {
			if (num > maxVal) maxVal = num;
		}
		float avg = (float)(Arrays.stream(nums).sum()) / maxVal * 100 / nums.length;
        return String.valueOf(avg);
    }

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}