import java.io.*;
import java.util.StringTokenizer;

public class BOJ20232 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		String[] arr = new String[]{
				"ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO",
				"SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
				"ITMO", "0", "SPbSU", "SPbSU", "ITMO",
				"ITMO", "ITMO", "ITMO", "SPbSU", "ITMO",
				"ITMO", "ITMO", "ITMO", "SPbSU", "ITMO"
		};
		int input = Integer.parseInt(br.readLine());
		int idx = input - 1995;
		String val = arr[idx];
		if (val.equals("0")) {
			sb.append("PetrSU, ITMO");
		} else {
			sb.append(val);
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
