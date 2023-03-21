import java.io.*;
import java.util.StringTokenizer;

public class BOJ20839 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		float A = Float.parseFloat(st.nextToken());
		float C = Float.parseFloat(st.nextToken());
		float E = Float.parseFloat(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int userA = Integer.parseInt(st.nextToken());
		int userC = Integer.parseInt(st.nextToken());
		int userE = Integer.parseInt(st.nextToken());

		if (userA >= A && userC >= C && userE >= E) {
			sb.append("A");
		} else if (userA >= A / 2 && userC >= C && userE >= E) {
			sb.append("B");
		} else if (userC >= C && userE >= E) {
			sb.append("C");
		} else if (userC >= C / 2 && userE >= E) {
			sb.append("D");
		} else {
			sb.append("E");
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
