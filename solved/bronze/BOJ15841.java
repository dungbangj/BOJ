import java.util.*;
import java.io.*;
import java.math.*;

public class BOJ15841 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<>();

		try {
			int max = -1;
			while (true) {
				int input = Integer.parseInt(br.readLine());
				if (input == -1) break;
				max = Math.max(max, input);
				q.offer(input);
			}

			BigInteger[] fiboDp = new BigInteger[max + 1];
			fiboDp[1] = fiboDp[2] = BigInteger.ONE;

			for (int i = 3; i < fiboDp.length; i++) {
				fiboDp[i] = fiboDp[i - 1].add(fiboDp[i - 2]);
			}

			while (!q.isEmpty()) {
				int time = q.poll();
				bw.write("Hour " + time + ": " + fiboDp[time] + " cow(s) affected\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
