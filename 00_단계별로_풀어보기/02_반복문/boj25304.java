import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class boj25304 {
	
	private static final Logger logger = Logger.getLogger(boj25304.class.getName());

	public static void main(String[] args) {
		printOutput(getResult(getInput()));
	}

	private static Pair<Integer, List<int[]>> getInput() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int totalMoney = Integer.parseInt(br.readLine().strip());
			int T = Integer.parseInt(br.readLine().strip());
			List<int[]> bought = new ArrayList<>();

			for (int i = 0; i < T; i++) {
				bought.add(Arrays.stream(br.readLine().split(" "))
							.mapToInt(Integer::parseInt)
							.toArray());
			}
			return new Pair<>(totalMoney, bought);

		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to read input!", e);
		}
		return new Pair<>(0, new ArrayList<>());
	}

	private static void printOutput(String result) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result + "\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to print output!", e);
		}
	}

	private static String getResult(Pair<Integer, List<int[]>> inputs) {
		if (isSame(inputs.getTotalMoney(), getSum(inputs.getBoughtItems())))
			return "Yes";
		return "No";
	}

	private static int getSum(List<int[]> bought) {
		int sum = 0;
		for (int[] item : bought) {
			sum += (item[0] * item[1]);
		}
		return sum;
	}

	private static boolean isSame(int totalMoney, int receipt) {
		return totalMoney == receipt;
	}
}

class Pair<K, V> {
	private final K totalMoney;
	private final V boughtItems;

	public Pair(K totalMoney, V boughtItems) {
		this.totalMoney = totalMoney;
		this.boughtItems = boughtItems;
	}

	public K getTotalMoney() {
		return totalMoney;
	}

	public V getBoughtItems() {
		return boughtItems;
	}
}