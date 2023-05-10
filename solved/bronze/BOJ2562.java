import java.math.*;
import java.io.*;
import java.util.*;

public class BOJ2562 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int max = -1;
		int maxIndex = -1;
		int input = 0;
		for (int i = 0; i < 9; i++) {
			input = Integer.parseInt(br.readLine());
			if (input > max) {
				max = input;
				maxIndex = i + 1;
			}
		}
		bw.write(max + "\n");
		bw.write(maxIndex + "\n");
		bw.flush();
		bw.close();
	}
}
