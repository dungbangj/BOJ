import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ4892 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int flag;

	public static void main(String[] args) throws IOException {

		int i = 1;
		while (true) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				break;
			}
			sb.append(i++).append(". ");
			int resultN4 = calculateNum(num);
			if (flag == 0) {
				sb.append("odd ").append(resultN4);
			} else {
				sb.append("even ").append(resultN4);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int calculateNum(int n0) {
		int n1 = 3 * n0;
		int n2, n3, n4;

		if (n1 % 2 == 0) {
			n2 = n1 / 2;
			flag = 1;
		} else {
			n2 = (n1 + 1) / 2;
			flag = 0;
		}

		n3 = 3 * n2;
		n4 = n3 / 9;

		return n4;
	}
}
