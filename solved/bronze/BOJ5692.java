import java.lang.*;
import java.io.*;
import java.util.*;

public class BOJ5692 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		int[] factArr = {1, 2, 6, 24, 120};

		while (true) {
			char[] input = br.readLine().toCharArray();
			int inputSize = input.length;
			if (input[0] == '0') {
				break;
			}
			int sum = 0;
			for (int i = 0; i < input.length; i++) {
				sum += (input[i] - '0') * factArr[inputSize - 1 - i];
			}
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
