import java.io.*;
import java.util.Arrays;
import java.util.Map;

public class BOJ2343 {

	static int N, M, L, R;
	static int[] times;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNM[0];
		M = inputNM[1];

		times = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < N; i++) {
			R += times[i];
			L = Math.max(L, times[i]);
		}

		bw.write(findLeft() + "\n");
		bw.flush();
		bw.close();
	}

	private static int findLeft() {
		while (L <= R) {
			int mid = (L + R) / 2;

			int count = getCount(mid);
			if (count > M) {
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}
		return L;
	}

	private static int getCount(int mid) {
		int sum = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {
			if (sum + times[i] > mid) {
				sum = 0;
				count++;
			}
			sum += times[i];
		}

		if (sum != 0) {
			count++;
		}
		return count;
	}
}
