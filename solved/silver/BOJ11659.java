import java.io.*;
import java.util.*;

public class BOJ11659 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		String[] arrInput = br.readLine().split(" ");
		int[] arr = new int[N + 1];
		int[] sumArr = new int[N + 1];

		for (int i = 0; i < arrInput.length; i++) {
			arr[i + 1] = Integer.parseInt(arrInput[i]);
		}

		sumArr[1] = arr[1];

		for (int i = 2; i < arr.length; i++) {
			sumArr[i] = sumArr[i - 1] + arr[i];
		}

		for (int i = 0; i < M; i++) {
			String[] rangeInput = br.readLine().split(" ");
			int from = Integer.parseInt(rangeInput[0]);
			int to = Integer.parseInt(rangeInput[1]);
			bw.write(sumArr[to] - sumArr[from - 1] + "\n");
		}
		bw.flush();
		bw.close();
	}


}
