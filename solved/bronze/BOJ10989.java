import java.io.*;

public class BOJ10989 {

	static final int MAX = 10_000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] counts = new int[MAX + 1];
		int maxVal = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			int inputNum = Integer.parseInt(br.readLine());
			counts[inputNum]++;
			if (inputNum > maxVal) maxVal = inputNum;
		}

		for (int i = 0; i <= maxVal; i++) {
			while (counts[i] != 0) {
				bw.write(i + "\n");
				counts[i]--;
			}
		}

		bw.flush();
		bw.close();
	}
}
