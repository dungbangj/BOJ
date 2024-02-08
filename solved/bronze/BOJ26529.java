import java.util.*;
import java.io.*;

public class BOJ26529 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<>();

		try {
			int T = Integer.parseInt(br.readLine());
			int max = -1;
			for (int i = 0; i < T; i++) {
				int input = Integer.parseInt(br.readLine());
				max = Math.max(max, input);
				q.offer(input);
			}

			long[] fiboDp = new long[max + 1];
			fiboDp[0] = fiboDp[1] = 1;

			for (int i = 2; i < fiboDp.length; i++) {
				fiboDp[i] = fiboDp[i - 1] + fiboDp[i - 2];
			}

			while (!q.isEmpty()) {
				int idx = q.poll();
				bw.write(fiboDp[idx] + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
