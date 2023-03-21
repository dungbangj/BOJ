import java.io.*;
import java.util.StringTokenizer;

public class BOJ16486 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int line = Integer.parseInt(br.readLine());
		int dia = Integer.parseInt(br.readLine());

		double result = 2 * line + (dia * 2 * 3.141592);
		sb.append(result);
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
