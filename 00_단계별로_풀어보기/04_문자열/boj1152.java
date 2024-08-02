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

public class boj1152 {

    private static final Logger logger = Logger.getLogger(boj1152.class.getName());

    public static void main(String[] args) {
        try {
            printOutput(String.valueOf(getInputData().length));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static String[] getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine().strip();
			if (input.isEmpty()) return new String[0];
			return input.split(" ");
        }
    }

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}