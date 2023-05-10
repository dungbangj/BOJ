import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11948 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < 4; i++) {
			int input = Integer.parseInt(br.readLine());
			arr1.add(input);
			sum1 += input;
		}
		arr1.sort(Comparator.naturalOrder());

		for (int i = 0; i < 2; i++) {
			int input = Integer.parseInt(br.readLine());
			arr2.add(input);
			sum2 += input;
		}
		arr2.sort(Comparator.naturalOrder());

		sb.append(sum1 - arr1.get(0) + sum2 - arr2.get(0));
		bw.write(sb.toString());
		clearBuffer();
	}

	private static void clearBuffer() throws IOException {
		br.close();
		bw.flush();
		bw.close();
	}
}
