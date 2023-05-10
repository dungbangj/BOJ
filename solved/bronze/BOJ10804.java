import java.io.*;
import java.util.*;

public class BOJ10804 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int[] cards = new int[21];

		for (int i = 1; i < 21; i++) {
			cards[i] = i;
		}
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			changeElements(cards, start, last);
		}
		for (int i = 1; i < 21; i++) {
			bw.write(String.valueOf(cards[i]));
			if (i != 20) {
				bw.write(" ");
			}
		}
		bw.write("\n");
		bw.flush();
		bw.close();
	}

	private static void changeElements(int[] cards, int start, int last) {
		int diff = last - start;

		for (int i = 0; i < diff / 2 + 1; i++) {
			int tmp = cards[start];
			cards[start++] = cards[last];
			cards[last--] = tmp;
		}
	}
}
