import java.io.*;
import java.util.StringTokenizer;

public class BOJ16693 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double P1 = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		double R = Double.parseDouble(st.nextToken());
		double P2 = Double.parseDouble(st.nextToken());

		double SliceOfPizza = A / P1;
		double WholePizza = (R * R * 3.14159265358) / P2;
		String result = (WholePizza > SliceOfPizza) ? "Whole pizza" : "Slice of pizza";
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
