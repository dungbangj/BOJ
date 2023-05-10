import java.io.*;
import java.util.StringTokenizer;

public class BOJ16727 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int pHome = Integer.parseInt(st.nextToken());
		int eAway = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int eHome = Integer.parseInt(st.nextToken());
		int pAway = Integer.parseInt(st.nextToken());

		int p = pHome + pAway;
		int e = eHome + eAway;
		if (p > e) {
			sb.append("Persepolis");
		} else if (p < e) {
			sb.append("Esteghlal");
		} else {
			if (pAway > eAway) {
				sb.append("Persepolis");
			} else if (pAway < eAway) {
				sb.append("Esteghlal");
			} else {
				sb.append("Penalty");
			}
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
