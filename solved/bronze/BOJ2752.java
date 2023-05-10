import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ2752 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];

		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for (int i = 0; i < 3; i++) {
			bw.write(arr[i] + " ");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
	}
}
