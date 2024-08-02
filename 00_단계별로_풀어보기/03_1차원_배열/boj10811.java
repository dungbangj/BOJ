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

public class boj10811 {

    private static final Logger logger = Logger.getLogger(boj10811.class.getName());

    public static void main(String[] args) {
        try {
            InputData inputData = getInputData();
            String result = getLastBoxes(inputData);
            printOutput(result);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to process input/output", e);
        }
    }

    private static InputData getInputData() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<int[]> basketSwaps = new ArrayList<>();
            String[] firstInput = br.readLine().split(" ");
			int basketCount = Integer.parseInt(firstInput[0]);
			int operationCount = Integer.parseInt(firstInput[1]);
			
			for (int i = 0; i < operationCount; i++) {
				int[] numbers = Arrays.stream(br.readLine().split(" "))
									  .mapToInt(Integer::parseInt)
									  .toArray();
				basketSwaps.add(numbers);
			}
            return new InputData(basketCount, basketSwaps);
        }
    }

    private static String getLastBoxes(InputData inputData) {
        StringBuilder sb = new StringBuilder();
		int[] boxes = initBoxes(inputData.getBasketCount());
	
        for (int[] boxRange : inputData.getNumbers()) {
            swapBoxes(boxes, boxRange);
        }
        return Arrays.toString(boxes).replaceAll("[\\[\\],]", "");
    }

	private static int[] initBoxes(int basketCount) {
		int[] boxes = new int[basketCount];
		for (int i = 0; i < basketCount; i++) {
			boxes[i] = i + 1;
		}
		return boxes;
	}

	private static void swapBoxes(int[] boxes, int[] boxRange) {
		int l = Math.min(boxRange[0], boxRange[1]);
		int r = Math.max(boxRange[0], boxRange[1]);

		while (l < r) {
			swap(l - 1, r - 1, boxes);
			l++;
			r--;
		}
	}

	private static void swap(int a, int b, int[] boxes) {
		int tmp = boxes[a];
		boxes[a] = boxes[b];
		boxes[b] = tmp;
	}

    private static void printOutput(String result) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.newLine();
        }
    }
}

class InputData {
    private final int basketCount;
    private final List<int[]> numbers;

    public InputData(int basketCount, List<int[]> numbers) {
        this.basketCount = basketCount;
        this.numbers = numbers;
    }

    public int getBasketCount() {
        return basketCount;
    }

    public List<int[]> getNumbers() {
        return numbers;
    }
}
