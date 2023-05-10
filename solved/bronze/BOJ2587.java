import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ2587 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		bw.write(sum / 5 + "\n");
		bw.write(arr[2] + "\n");
		bw.flush();
		bw.close();
	}
}
