import java.io.*;
import java.util.*;

public class BOJ10808 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int[] alpha = new int[26];
		char[] input = br.readLine().toCharArray();

		for (char inputChar : input) {
			alpha[inputChar - 97]++;
		}
		for (int num : alpha) {
			bw.write(num + " ");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
	}
}
