import java.io.*;
import java.util.StringTokenizer;

public class BOJ20867 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		float M = Float.parseFloat(st.nextToken());
		float S = Float.parseFloat(st.nextToken());
		float G = Float.parseFloat(st.nextToken());

		st = new StringTokenizer(br.readLine());
		float A = Float.parseFloat(st.nextToken());
		float B = Float.parseFloat(st.nextToken());

		st = new StringTokenizer(br.readLine());
		float L = Float.parseFloat(st.nextToken());
		float R = Float.parseFloat(st.nextToken());

		float fast = L / A + M / G;
		float slow = R / B + M / S;

		if (fast < slow) {
			sb.append("friskus");
		} else {
			sb.append("latmask");
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
