import java.io.*;
import java.util.*;

public class BOJ1940 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] inputArr = new int[N];

		for (int i = 0; i < N; i++) {
			inputArr[i] = Integer.parseInt(input[i]);
		}

		Arrays.sort(inputArr);

		int startIdx = 0;
		int endIdx = N - 1;
		int count = 0;

		while (startIdx < endIdx) {
			int start = inputArr[startIdx];
			int end = inputArr[endIdx];
			int sum = start + end;

			if (sum == M) {
				count++;
				startIdx++;
				endIdx--;
			} else if (sum < M) startIdx++;
			else endIdx--;

		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
