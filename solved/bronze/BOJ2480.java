import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ2480 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if (arr[0] == arr[1] && arr[1] == arr[2]) {
			bw.write(10000 + arr[0] * 1000 + "\n");
		} else if (arr[0] == arr[1] || arr[0] == arr[2]) {
			bw.write(1000 + arr[0] * 100 + "\n");
		} else if (arr[1] == arr[2]) {
			bw.write(1000 + arr[1] * 100 + "\n");
		} else {
			int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
			bw.write(max * 100 + "\n");
		}
		bw.flush();
		bw.close();
	}
}
