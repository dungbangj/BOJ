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

public class boj2675 {

    private static final Logger logger = Logger.getLogger(boj2675.class.getName());

    public static void main(String[] args) {
        try {
            printOutput(countAlpha(getInputData()));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static List<InputData> getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int operationCount = Integer.parseInt(br.readLine().strip());
			List<InputData> datas = new ArrayList<>();

			for (int i = 0; i < operationCount; i++) {
				String[] input = br.readLine().split(" ");
				int count = Integer.parseInt(input[0]);
				char[] word = input[1].toCharArray();
				InputData inputData = new InputData(count, word);
				datas.add(inputData);
			}
			return datas;
        }
    }

	private static String countAlpha(List<InputData> datas) {
		StringBuilder sb = new StringBuilder();

		for (InputData data : datas) {
			int count = data.getCount();
			char[] word = data.getWord();

			for (char oneChar : word) {
				sb.append(String.valueOf(oneChar).repeat(count));
			}
			sb.append("\n");
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

class InputData {
    private final int count;
    private final char[] word;

    public InputData(int count, char[] word) {
        this.count = count;
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public char[] getWord() {
        return word;
    }
}