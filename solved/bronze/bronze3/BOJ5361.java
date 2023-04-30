import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class BOJ5361 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		float[] prices = {350.34f, 230.90f, 190.55f, 125.30f, 180.90f};

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			float totalPrice = 0f;

			for (int j = 0; j < 5; j++) {
				totalPrice += prices[j] * Float.parseFloat(st.nextToken());
			}
			sb.append("$").append(String.format("%.2f", totalPrice)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
