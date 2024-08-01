import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj1001 {

	private static final Logger logger = Logger.getLogger(boj1001.class.getName());

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int[] inputs = Arrays.stream(br.readLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();

			System.out.println(inputs[0] - inputs[1]);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Invalid Input", e);
		}

	}
}
