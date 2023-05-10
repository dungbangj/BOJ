import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class BOJ2959 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int[] steps = new int[4];
		for (int i = 0; i < 4; i++) {
			steps[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(steps);
		bw.write(steps[0] * steps[2] + "\n");
		bw.flush();
		bw.close();
	}
}
