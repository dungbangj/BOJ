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

public class boj10813 {

    private static final Logger logger = Logger.getLogger(boj10813.class.getName());

    public static void main(String[] args) {
        try {
            InputData inputData = getInputData();
            printOutput(String.valueOf(getLastBaskets(inputData)));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static InputData getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<int[]> tmpInputs = new ArrayList<>();

            int[] firstInput = Arrays.stream(br.readLine().split(" "))
									 .mapToInt(Integer::parseInt)
									 .toArray();
			
			for (int i = 0; i < firstInput[1]; i++) {
				tmpInputs.add(Arrays.stream(br.readLine().split(" "))
									   .mapToInt(Integer::parseInt)
									   .toArray());
			}
			return new InputData(firstInput[0], tmpInputs);
        }
    }

    private static String getLastBaskets(InputData inputData) {
		int[] baskets = initBaskets(inputData.getBasketNum());
        for (int[] number : inputData.getNumbers()) {
			int aBasket = number[0] - 1;
			int bBasket = number[1] - 1;
			swapBasket(baskets, aBasket, bBasket);
        }
        return Arrays.toString(baskets).replaceAll("[,\\[\\]]", "");
    }

	private static int[] initBaskets(int basketNumber) {
		int[] baskets = new int[basketNumber];
		for (int i = 0; i < basketNumber; i++) {
			baskets[i] = i + 1;
		}
		return baskets;
	}

	private static void swapBasket(int[] baskets, int a, int b) {
		int tmp = baskets[a];
		baskets[a] = baskets[b];
		baskets[b] = tmp;
	}

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}

class InputData {
    private final int basketNum;
    private final List<int[]> numbers;

    public InputData(int basketNum, List<int[]> numbers) {
        this.basketNum = basketNum;
        this.numbers = numbers;
    }

    public int getBasketNum() {
        return basketNum;
    }

    public List<int[]> getNumbers() {
        return numbers;
    }
}
