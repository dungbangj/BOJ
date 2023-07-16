import java.io.*;
import java.util.*;

public class BOJ1253 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(input);
		int count = 0;

		for (int i = 0; i < N; i++) {
			int targetNum = input[i];
			int targetIdx = i;
			int startIdx = 0;
			int endIdx = N - 1;

			while (startIdx < endIdx) {
				if (startIdx != targetIdx && endIdx != targetIdx) {
					int start = input[startIdx];
					int end = input[endIdx];
					long sum = start + end;

					if (sum == targetNum) {
						count++;
						break;
					} else if (sum < targetNum) startIdx++;
					else endIdx--;
				} else if (startIdx == targetIdx) startIdx++;
				else endIdx--;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
