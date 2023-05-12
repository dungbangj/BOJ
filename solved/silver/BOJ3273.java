import javax.sound.sampled.EnumControl;
import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ3273 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(br.readLine());
		int[] inputArr = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(inputArr);
		int sumDes = Integer.parseInt(br.readLine());

		int start = 0;
		int last = n - 1;
		int count = 0;

		while (start < last) {
			int sum = inputArr[start] + inputArr[last];

			if (sum > sumDes) {
				last--;
			} else if (sum < sumDes) {
				start++;
			} else {
				count++;
				last--;
				start++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
