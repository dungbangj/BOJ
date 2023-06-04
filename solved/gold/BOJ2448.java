import java.io.*;
import java.util.*;

public class BOJ2448 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Character[][] map;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		map = new Character[N][N * 2 - 1];

		for (int i = 0; i < N; i++) {
			Arrays.fill(map[i], ' ');
		}

		make(0, N - 1, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N * 2 - 1; j++) {
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static void make(int row, int col, int n) {

		if (n == 3) {
			map[row][col] = '*';
			map[row + 1][col + 1] = map[row + 1][col - 1] = '*';
			for (int i = 0; i < 5; i++) {
				map[row + 2][col - 2 + i] = '*';
			}
		} else {
			int halfN = n / 2;

			make(row, col, halfN);
			make(row + halfN, col + halfN, halfN);
			make(row + halfN, col - halfN, halfN);
		}
	}
}