import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ1475 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int[] num = new int[10];
		char[] input = br.readLine().toCharArray();
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			num[input[i] - '0']++;
		}
//		System.out.println(Arrays.toString(num));

		if (num[6] > num[9]) {
			num[6] = (int)Math.ceil(((num[6] - num[9])) / (double)2) + num[9];
			num[9] = 0;
		} else if (num[9] > num[6]) {
			num[9] = (int) Math.ceil(((num[9] - num[6]) / (double)2)) + num[6];
			num[6] = 0;
		}
//		System.out.println(Arrays.toString(num));
		int max = 0;

		for (int j : num) {
			if (max < j) {
				max = j;
			}
		}

		bw.write(max + "\n");
		bw.flush();
		bw.close();
	}
}
