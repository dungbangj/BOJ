import java.io.*;
import java.util.StringTokenizer;

public class BOJ10156 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int snackPrice = Integer.parseInt(st.nextToken());
		int totalSnacks = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		int totalPrice = totalSnacks * snackPrice;
		if (totalPrice > money) {
			sb.append(Math.abs(totalPrice - money));
		} else {
			sb.append(0);
		}
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
