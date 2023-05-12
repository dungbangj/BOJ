import java.io.*;
import java.math.*;
import java.util.*;

public class BOJ1919 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		char[] firstInput = br.readLine().toCharArray();
		char[] secondInput = br.readLine().toCharArray();
		int[] firstAlpha = new int[26];
		int[] secondAlpha = new int[26];
		int count = 0;

		for (char c : firstInput) {
			firstAlpha[c - 97]++;
		}

		for (char c : secondInput) {
			secondAlpha[c - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			count += Math.abs(firstAlpha[i] - secondAlpha[i]);
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
