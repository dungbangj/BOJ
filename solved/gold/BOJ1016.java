import java.io.*;
import java.util.Arrays;

public class BOJ1016 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long min = inputNM[0];
		long max = inputNM[1];

		int range = (int)(max - min + 1);
		boolean[] notDividable = new boolean[range];

		for (long i = 2; i < Math.sqrt(max) + 1; i++) {
			long square = i * i;
			long start = min % square == 0 ? min / square : (min / square) + 1;

			for (long j = start; j * square <= max; j++) {
				notDividable[(int) (j * square - min)] = true;
			}
		}

		int count = 0;
		for (boolean isDividable : notDividable) {
			if (!isDividable) count++;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
