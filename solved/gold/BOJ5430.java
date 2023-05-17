import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ5430 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			char[] cmd = br.readLine().toCharArray();
			int n = Integer.parseInt(br.readLine());
			String[] arrStr = br.readLine().replaceAll("\\[|\\]", "").split(",");
			Deque<String> arr = new LinkedList<>();
			for (int j = 0; j < n; j++) {
				arr.add(arrStr[j]);
			}

			boolean reverse = false;
			boolean error = false;
			for (char c : cmd) {
				if (c == 'R') {
					reverse = !reverse;
				} else if (c == 'D') {
					if (arr.isEmpty()) {
						error = true;
						break;
					}
					if (reverse) {
						arr.pollLast();
					} else {
						arr.pollFirst();
					}
				}
			}

			if (error) {
				bw.write("error\n");
			} else {
				bw.write("[");
				if (!arr.isEmpty()) {
					if (reverse) {
						bw.write(arr.pollLast());
						while (!arr.isEmpty()) {
							bw.write("," + arr.pollLast());
						}
					} else {
						bw.write(arr.pollFirst());
						while (!arr.isEmpty()) {
							bw.write("," + arr.pollFirst());
						}
					}
				}
				bw.write("]\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
