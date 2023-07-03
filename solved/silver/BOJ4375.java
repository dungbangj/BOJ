import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ4375 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String input;

		while ((input = br.readLine()) != null) {
			BigInteger bigInput = new BigInteger(input);
			BigInteger ones = BigInteger.ONE;

			int i = 1;
			while (true) {
				if (ones.remainder(bigInput).equals(BigInteger.ZERO)) {
					System.out.println(i);
					break;
				}
				i++;
				ones = ones.multiply(BigInteger.TEN).add(BigInteger.ONE);
			}
		}
	}
}
