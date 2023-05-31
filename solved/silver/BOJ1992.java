import java.io.*;

public class BOJ1992 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static char[][] inputArr;

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());

		inputArr = new char[N][N];

		for (int i = 0; i < N; i++) {
			char[] oneLine = br.readLine().toCharArray();
			System.arraycopy(oneLine, 0, inputArr[i], 0, N);
		}
		dfsPartition(0, 0, N);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfsPartition(int startI, int startJ, int len) {
		int compo = inputArr[startI][startJ];
		
		if (checkOneSite(startI, startJ, len)) {
			sb.append(compo - '0');
			return;
		}

		int halfLen = len / 2;
		int newStartI = startI + halfLen;
		int newStartJ = startJ + halfLen;

		sb.append("(");

		dfsPartition(startI, startJ, halfLen);
		dfsPartition(startI, newStartJ, halfLen);
		dfsPartition(newStartI, startJ, halfLen);
		dfsPartition(newStartI, newStartJ, halfLen);

		sb.append(")");
	}

	private static boolean checkOneSite(int startI, int startJ, int len) {
		int compo = inputArr[startI][startJ];

		for (int i = startI; i < startI + len; i++) {
			for (int j = startJ; j < startJ + len; j++) {
				if (inputArr[i][j] != compo) {
					return false;
				}
			}
		}
		return true;
	}
}
