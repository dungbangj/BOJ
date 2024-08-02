import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashSet;
import java.util.Set;

public class boj3052 {

    private static final Logger logger = Logger.getLogger(boj3052.class.getName());

    public static void main(String[] args) {
        try {
            int[] inputData = getInputData();
            printOutput(String.valueOf(checkStudents(inputData)));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static int[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] inputs = new int[10];
			for (int i = 0; i < 10; i++) {
				inputs[i] = Integer.parseInt(br.readLine().strip());
			}
			return inputs;
        }
    }

    private static String checkStudents(int[] inputData) {
		Set<Integer> nums = new HashSet<>();
        
		for (int num : inputData) {
			nums.add(num % 42);
		}
        return String.valueOf(nums.size());
    }

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}
