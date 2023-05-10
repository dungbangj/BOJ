import java.io.*;
import java.util.StringTokenizer;

public class BOJ16199 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int birthYear = Integer.parseInt(st.nextToken());
		int birthMonth = Integer.parseInt(st.nextToken());
		int birthDay = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		int y = year - birthYear;
		int m = month - birthMonth;
		int d = day - birthDay;

		int tmpY = y;
		if (y > 0 && ((m == 0 && d < 0) || (m < 0))) {
			tmpY -= 1;
		}
		sb.append(tmpY).append("\n");

		sb.append(y + 1).append("\n");
		sb.append(y).append("\n");

		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
