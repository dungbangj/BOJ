import java.io.*;
import java.util.StringTokenizer;

public class BOJ21335 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		long area = Long.parseLong(br.readLine());
		double radius = Math.sqrt(area / Math.PI);
		sb.append(2 * Math.PI * radius);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
