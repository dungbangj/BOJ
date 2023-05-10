import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ2576 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int sum = 0;
		int min = 999;
		int input = 0;

		for (int i = 0; i < 7; i++) {
			input = Integer.parseInt(br.readLine());
			if (input % 2 != 0) {
				sum += input;
				if (input < min) {
					min = input;
				}
			}
		}
		if (sum == 0) {
			bw.write("-1\n");
		} else {
			bw.write(sum + "\n");
			bw.write(min + "\n");
		}
		bw.flush();
		bw.close();
	}
}
