import java.io.*;
import java.util.*;

public class BOJ11328 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] main) throws IOException {

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			char[] firstInput = st.nextToken().toCharArray();
			char[] secondInput = st.nextToken().toCharArray();
			int[] alpha = new int[26];
			int flag = 0;

			for (char c : firstInput) {
				alpha[c - 97]++;
			}

			for (char c : secondInput) {
				alpha[c - 97]--;
			}

			for (int c : alpha) {
				if (c != 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 1) {
				bw.write("Impossible\n");
			} else {
				bw.write("Possible\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
