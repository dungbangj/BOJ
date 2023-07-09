import java.io.*;
import java.util.*;

public class BOJ7785 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Map<String, Character> atWork = new TreeMap<>(Collections.reverseOrder());

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			if (input[1].equals("enter")) {
				atWork.put(input[0], '1');
			} else {
				atWork.remove(input[0]);
			}
		}

		for (String one : atWork.keySet()) {
			bw.write(one + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
