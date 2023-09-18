import java.io.*;

public class BOJ11720 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		char[] inputNum = br.readLine().toCharArray();
		int sum = 0;

		for (char c : inputNum) {
			sum += c - '0';
		}

		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
}
