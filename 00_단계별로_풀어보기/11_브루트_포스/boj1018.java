import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj1018 {

	public static void main(String[] args) {
		try {
			char[][] board = getInputData();
			int minPaints = getMinPaintCount(board);
			printOutput(String.valueOf(minPaints));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static char[][] getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] NM = Arrays.stream(br.readLine().split(" "))
							.mapToInt(Integer::parseInt)
							.toArray();
			char[][] board = new char[NM[0]][NM[1]];

			for (int i = 0; i < NM[0]; i++) {
				board[i] = br.readLine().toCharArray();
			}
			return board;
		}
	}

	private static int getMinPaintCount(char[][] inputData) {
		char[][] refWhiteFirst = {
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
		};
		char[][] refBlackFirst = {
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
		};

		int minCount = Integer.MAX_VALUE;

		for (int i = 0; i <= inputData.length - 8; i++) {
			for (int j = 0; j <= inputData[0].length - 8; j++) {
				int whiteFirstCount = 0;
				int blackFirstCount = 0;

				for (int k = 0; k < 8; k++) {
					for (int h = 0; h < 8; h++) {
						if (inputData[i + k][j + h] != refWhiteFirst[k][h]) whiteFirstCount++;
						if (inputData[i + k][j + h] != refBlackFirst[k][h]) blackFirstCount++;
					}
				}

				minCount = Math.min(minCount, Math.min(whiteFirstCount, blackFirstCount));
			}
		}
		return minCount;
	}

	private static void printOutput(String result) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(result);
			bw.newLine();
		}
	}
}
