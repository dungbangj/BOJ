import java.io.*;
import java.util.*;

public class BOJ1747 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int inputMin = Integer.parseInt(br.readLine());
		int max = 1003002;

		boolean[] isPrime = new boolean[max];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i < max; i++) {
			for (int j = 2; i * j < max; j++) {
				isPrime[i * j] = false;
			}
		}
		Queue<Integer> primes = new LinkedList<>();

		for (int i = inputMin; i < isPrime.length; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}

		while (!primes.isEmpty()) {
			String polledPrime = String.valueOf(primes.poll());
			String reverPrime = new StringBuilder(polledPrime).reverse().toString();
			if (polledPrime.equals(reverPrime)) {
				bw.write(polledPrime + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
