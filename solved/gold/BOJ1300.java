import java.io.*;
import java.util.*;

public class BOJ1300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		long lo = 1;
		long hi = K;

		while (lo < hi) {
			long mid = (lo + hi) / 2;
			long count = 0;
//			System.out.println("mid = " + mid);
			for (int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
//				System.out.println("count = " + count);
			}
			if (K <= count) {
				hi = mid;
//				System.out.println("hi = " + hi);
			} else {
				lo = mid + 1;
//				System.out.println("lo = " + lo);
			}
//			System.out.println();
		}

		bw.write(lo + "\n");
		bw.flush();
		bw.close();
	}
}
