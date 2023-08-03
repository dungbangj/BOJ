import java.io.*;
import java.util.*;

public class BOJ1016 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] inputMM = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		long min = inputMM[0];
		long max = inputMM[1];

		long range = max - min + 1;
		boolean[] notDividable = new boolean[(int) range];

		for (long i = 2; i * i <= max; i++) {
			long iPow = i * i;
			long start = min % iPow == 0 ? min / iPow : (min / iPow) + 1;

//			System.out.println("start = " + start);
//			System.out.println("iPow = " + iPow);
//			System.out.println();
			for (long j = start; j * iPow <= max; j++) {
				notDividable[(int) (j * iPow - min)] = true;
			}
		}

		int count = 0;
		for (boolean isDividable : notDividable) {
			if (!isDividable) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
