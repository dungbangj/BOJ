import java.util.*;
import java.io.*;

public class BOJ2630 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[][] arr;
	static int white = 0;
	static int blue = 0;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			String[] inputArr = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(inputArr[j]);
			}
		}
		partition(0, 0, N);
		bw.write(white + "\n" + blue + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static void partition(int row, int col, int size) {

		if (colorCheck(row, col, size)) {
			if (arr[row][col] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}

		int halfSize = size / 2;

		partition(row, col, halfSize);
		partition(row, col + halfSize, halfSize);
		partition(row + halfSize, col, halfSize);
		partition(row + halfSize, col + halfSize, halfSize);
	}

	private static boolean colorCheck(int startI, int startJ, int len) {
		int startVal = arr[startI][startJ];

		for (int i = startI; i < startI + len; i++) {
			for (int j = startJ; j < startJ + len; j++) {
				if (arr[i][j] != startVal) {
					return false;
				}
			}
		}
		return true;
	}
}
