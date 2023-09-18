import java.io.*;
import java.util.Arrays;

/**
 * 고려해야할 것
 * - 2차원 구간 합 공식
 * - 최악 시간 복잡도: N3
 * - 최선 시간 복잡도: N2
 */
public class BOJ11660 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0];
		int M = inputNM[1];

		int[][] matrix = new int[N + 1][N + 1];
		int[][] sumDeepArr = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			int[] inputLine = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 1; j <= N; j++) {
				matrix[i][j] = inputLine[j - 1];
			}
		}

		/**
		 * 2차원 구간 합 공식: D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]
		 * 가로와 세로를 더한 뒤에 겹치는 부분을 빼주고, 새롭게 추가되는 한 칸을 더해주면 된다.
		 * 지금 구하는 구간 합의 기준은 항상 (1, 1)이다. 이 기준을 중심으로 모든 구간의 합을 구해놓는다.
		 */
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				sumDeepArr[i][j] = sumDeepArr[i][j - 1] + sumDeepArr[i - 1][j] - sumDeepArr[i - 1][j - 1] + matrix[i][j];
			}
		}

		/**
		 * 이제 (1, 1)을 기준으로 하는 모든 구간의 합이 구해졌으므로, 시작점과 끝점이 따로 주어지는 구간합에서는 이를 응용하면 된다.
		 * 시작점과 끝점이 정해져 있는 2차원 구간 합 공식: D[X2][Y2] ~ D[X1][Y1] = D[X2][Y2] - (D[X1 - 1][Y2] + D[X2][Y1 - 1]) + D[X1 - 1][Y1 - 1]
		 * 시작점(D[X1][Y1])에서 한 칸 줄어든 칸(D[X1 - 1][Y1 - 1])을 기준으로 두고 계산하면 된다. 세로와 가로 구간합을 빼주고, 겹치는 부분이 두 번 빼졌으니 한 번 더해주는 것이다.
		 */
		for (int i = 0; i < M; i++) {
			int[] inputXYs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int X1 = inputXYs[0];
			int Y1 = inputXYs[1];
			int X2 = inputXYs[2];
			int Y2 = inputXYs[3];

			int resultSum = sumDeepArr[X2][Y2] - (sumDeepArr[X2][Y1 - 1] + sumDeepArr[X1 - 1][Y2]) + sumDeepArr[X1 - 1][Y1 - 1];
			bw.write(resultSum + "\n");
		}
		bw.flush();
		bw.close();
	}
}
