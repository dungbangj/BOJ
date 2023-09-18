import java.io.*;
import java.util.Arrays;

public class BOJ1546 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int M = Integer.MIN_VALUE;
		int sum = 0;

		int[] inputScores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		for (int score : inputScores) {
			if (M < score) M = score;
			sum += score;
		}

		double newAvg = (double) sum / M * 100 / N;
		bw.write(newAvg + "\n");
		bw.flush();
		bw.close();
	}
}
