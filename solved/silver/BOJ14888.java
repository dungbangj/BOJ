import java.io.*;
import java.util.*;

public class BOJ14888 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N;
	static int[] operands;
	static int[] operators = new int[4];
	static int numMax = Integer.MIN_VALUE;
	static int numMin = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");

		operands = new int[N];
		for (int i = 0; i < N; i++) {
			operands[i] = Integer.parseInt(input[i]);
		}
		String[] input2 = br.readLine().split(" ");
		for (int i = 0; i < 4; i++) {
			operators[i] = Integer.parseInt(input2[i]);
		}
		dfs(operands[0], 1);

		bw.write(numMax + "\n" + numMin);
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int num, int depth) {
		if (depth == N) {
			numMax = Math.max(num, numMax);
			numMin = Math.min(num, numMin);
			return;
		}

		int nextDepth = depth + 1;
		for (int i = 0; i < 4; i++) {
			if (operators[i] > 0) {
				operators[i]--;
				switch (i) {
					case 0:
						dfs(num + operands[depth], nextDepth);
						break;
					case 1:
						dfs(num - operands[depth], nextDepth);
						break;
					case 2:
						dfs(num * operands[depth], nextDepth);
						break;
					case 3:
						dfs(num / operands[depth], nextDepth);
						break;
				}
				operators[i]++;
			}
		}
	}
}
