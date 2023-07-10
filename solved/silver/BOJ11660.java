import java.io.*;
import java.util.*;

public class BOJ11660 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int[][] arr = new int[N + 1][N + 1];
		int[][] sumArr = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			String[] oneLine = br.readLine().split(" ");
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(oneLine[j - 1]);
			}
		}


//		for (int i = 0; i <= N; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}

		sumArr[1][1] = arr[1][1];
		for (int i = 1; i < N; i++) {
			sumArr[1][i + 1] = sumArr[1][i] + arr[1][i + 1];
			sumArr[i + 1][1] = sumArr[i][1] + arr[i + 1][1];
		}

//		for (int i = 0; i <= N; i++) {
//			System.out.println(Arrays.toString(sumArr[i]));
//		}

		for (int i = 2; i <= N; i++) {
			for (int j = 2; j <= N; j++) {
				sumArr[i][j] = arr[i][j] + sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1];
			}
		}
//		System.out.println();
		for (int i = 0; i <= N; i++) {
//			System.out.println(Arrays.toString(sumArr[i]));
		}

		for (int i = 0; i < M; i++) {
			String[] oneInput = br.readLine().split(" ");
			int x1 = Integer.parseInt(oneInput[0]);
			int y1 = Integer.parseInt(oneInput[1]);
			int x2 = Integer.parseInt(oneInput[2]);
			int y2 = Integer.parseInt(oneInput[3]);

			int ans = sumArr[x2][y2] + sumArr[x1 - 1][y1 - 1] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1];
			bw.write(ans + "\n");
		}
		bw.flush();
		bw.close();
	}
}
