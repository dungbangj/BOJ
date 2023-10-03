import java.io.*;

public class BOJ1300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		long low = 1;
		long high = K;

		while (low < high) {
			long mid = (low + high) / 2;
			long count = 0;

			for (int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
//				System.out.println("count = " + count);
			}

			if (K <= count) high = mid;
			else low = mid + 1;

//			System.out.println("low = " + low);
//			System.out.println("high = " + high);
//			System.out.println("count = " + count);
		}

		bw.write(low + "\n");
		bw.flush();
		bw.close();
	}
}
