import java.io.*;
import java.util.StringTokenizer;

public class BOJ20352 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		long area = Long.parseLong(br.readLine());
		double round = calculateOutput(area);
		sb.append(round);
		bw.write(sb.toString());
		clearBuffer();
	}

	public static double calculateOutput(long circleArea) {
		return 2 * Math.sqrt(circleArea / Math.PI) * Math.PI;
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
