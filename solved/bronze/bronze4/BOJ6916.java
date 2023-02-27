import java.io.*;
import java.util.StringTokenizer;

public class BOJ6916 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int[] arr1 = new int[]{0, 2, 3, 5, 6, 7, 8, 9};
		int[] arr2 = new int[]{0, 4, 8, 9};
		int[] arr3 = new int[]{5, 6};
		int[] arr4 = new int[]{2, 3, 4, 5, 6, 8, 9};
		int[] arr5 = new int[]{0, 6, 8};
		int[] arr6 = new int[]{1, 3, 4, 5, 7, 9};
		int[] arr7 = new int[]{0, 2, 3, 5, 6, 8, 9};

		int input = Integer.parseInt(br.readLine());
		if (find(input, arr1)) {
			sb.append(" * * *");
		}
		sb.append("\n");
		for (int i = 0; i < 3; i++) {
			if (find(input, arr2)) {
				sb.append("*     *");
			} else if (find(input, arr3)) {
				sb.append("*");
			} else {
				sb.append("      *");
			}
			sb.append("\n");
		}
		if (find(input, arr4)) {
			sb.append(" * * *");
		}
		sb.append("\n");
		for (int i = 0; i < 3; i++) {
			if (find(input, arr5)) {
				sb.append("*     *");
			} else if (find(input, arr6)) {
				sb.append("      *");
			} else {
				sb.append("*");
			}
			sb.append("\n");
		}
		if (find(input, arr7)) {
			sb.append(" * * *");
		}
		sb.append("\n");
		bw.write(sb.toString());
		clearBuffer();
	}

	private static boolean find(int input, int[] arr) {
		for (int j : arr) {
			if (input == j) {
				return true;
			}
		}
		return false;
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}