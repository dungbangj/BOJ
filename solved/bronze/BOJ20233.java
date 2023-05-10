import java.io.*;
import java.util.StringTokenizer;

public class BOJ20233 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(br.readLine()); //10
		int x = Integer.parseInt(br.readLine()); //1
		int b = Integer.parseInt(br.readLine()); //20
		int y = Integer.parseInt(br.readLine()); //5
		int T = Integer.parseInt(br.readLine()); //50

		int sumA = a;
		int sumB = b;
		int tmpT = T;
		if (tmpT - 30 > 0) {
			tmpT -= 30;
			sumA += tmpT * x * 21;
		}
		if (T - 45 > 0) {
			T -= 45;
			sumB += T * y * 21;
		}
		sb.append(sumA).append(" ").append(sumB);
		bw.write(sb.toString()); //430 545
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
