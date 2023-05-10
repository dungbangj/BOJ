import java.io.*;
import java.util.*;

public class BOJ2577 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int mul = 1;
		for (int i = 0; i < 3; i++) {
			mul *= Integer.parseInt(br.readLine());
		}
		char[] mulArr = String.valueOf(mul).toCharArray();
		int[] numCount = new int[10];
		for (int i = 0; i < mulArr.length; i++) {
			numCount[mulArr[i] - '0']++;
		}

		for (int j : numCount) {
			bw.write(j + "\n");
		}
		bw.flush();
		bw.close();
	}
}
