import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class boj27866 {

    private static final Logger logger = Logger.getLogger(boj27866.class.getName());

    public static void main(String[] args) {
        try {
            InputData inputData = getInputData();
            char result = getOneChar(inputData);
            printOutput(result);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static InputData getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String word = br.readLine().strip();
			int index = Integer.parseInt(br.readLine().strip());
            return new InputData(index, word);
        }
    }

    private static char getOneChar(InputData inputData) {
		return inputData.getWord().charAt(inputData.getIdx() - 1);
    }

    private static void printOutput(char result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}

class InputData {
    private final int idx;
    private final String word;

    public InputData(int idx, String word) {
        this.idx = idx;
        this.word = word;
    }

    public int getIdx() {
        return idx;
    }

    public String getWord() {
        return word;
    }
}