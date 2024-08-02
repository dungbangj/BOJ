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

public class boj5597 {

    private static final Logger logger = Logger.getLogger(boj5597.class.getName());

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
			int[] inputs = new int[28];
			for (int i = 0; i < 28; i++) {
				inputs[i] = Integer.parseInt(br.readLine().strip());
			}
			return inputs;
        }
    }

    private static String checkStudents(int[] inputData) {
		boolean[] students = new  boolean[31];
        
		for (int student : inputData) {
			students[student] = true;
		}
        return getBadStudents(students);
    }

	private static String getBadStudents(boolean[] students) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < students.length; i++) {
			if (!students[i]) sb.append(i).append("\n");
		}
		return sb.toString();
	}

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}
