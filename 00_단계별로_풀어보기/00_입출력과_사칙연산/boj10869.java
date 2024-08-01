import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj10869 {

	public static final Logger logger = Logger.getLogger(boj10869.class.getName());
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {


			int[] inputs = Arrays.stream(br.readLine().split(" "))
								.mapToInt(Integer::parseInt)
								.toArray();
			int A = inputs[0];
			int B = inputs[1];

			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);
			System.out.println(A / B);
			System.out.println(A % B);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Invalid input!", e);
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				logger.log(Level.WARNING, "Buffered class close fail", e);
			}

		}
	}
}
