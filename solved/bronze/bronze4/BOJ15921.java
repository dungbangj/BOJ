import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ15921 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		if (N == 0) {
			bw.write("divide by zero");
			clearBuffer();
			System.exit(0);
		}
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> scores = new ArrayList<>();
		int sum = 0;
		while (st.hasMoreTokens()) {
			int input = Integer.parseInt(st.nextToken());
			scores.add(input);
			sum += input;
		}
		float average = sum / (float)N;
		float aSum = 0;
		for (int i = 0; i < N; i++) {
			aSum += scores.get(i) / (float)N;
		}
		sb.append(String.format("%.2f", average / aSum));
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
