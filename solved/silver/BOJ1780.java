import java.io.*;
import java.util.*;

public class BOJ1780 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][] arr;
	static int count1, count2, count3;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		partition(0, 0, N);
		bw.write(count1 + "\n" + count2 + "\n" + count3 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static void partition(int startI, int startJ, int size) {
		if (numCheck(startI, startJ, size)) {
			if (arr[startI][startJ] == -1) {
				count1++;
			} else if (arr[startI][startJ] == 0) {
				count2++;
			} else {
				count3++;
			}
			return;
		}
		int sizeOne = size / 3;
		int sizeTwo = sizeOne * 2;
		size /= 3;

//		System.out.println(startI + ", " + startJ);
		partition(startI, startJ, size);
		partition(startI, startJ + sizeOne, size);
		partition(startI, startJ + sizeTwo, size);

		partition(startI + sizeOne, startJ, size);
		partition(startI + sizeOne, startJ + sizeOne, size);
		partition(startI + sizeOne, startJ + sizeTwo, size);

		partition(startI + sizeTwo, startJ, size);
		partition(startI + sizeTwo, startJ + sizeOne, size);
		partition(startI + sizeTwo, startJ + sizeTwo, size);

	}

	private static boolean numCheck(int startI, int startJ, int len) {
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
