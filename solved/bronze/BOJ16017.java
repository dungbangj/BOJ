import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class BOJ16017 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}
		if ((nums.get(0) == 9 || nums.get(0) == 8 ) && (nums.get(3) == 9 || nums.get(3) == 8) && (Objects.equals(nums.get(1), nums.get(2)))) {
			sb.append("ignore");
		} else {
			sb.append("answer");
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
