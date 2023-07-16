import java.io.*;
import java.util.*;

public class BOJ2018 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		int start = 1;
		int end = 1;
		int sum = 1;
		int count = 1;

		while (end != N) {
			if (sum < N) sum += (++end);
			else if (sum > N) sum -= (start++);
			else {
				count++;
				sum += (++end);
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
