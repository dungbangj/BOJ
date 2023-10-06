import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNK[0];
		int K = inputNK[1];
		int[] currency = new int[N];
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < currency.length; i++) {
			currency[i] = Integer.parseInt(br.readLine());
		}

//		System.out.println("currency = " + Arrays.toString(currency));

		int count = 0;

		for (int j = 0; j < N; j++) {
			int tmpMoney = K;
			count = 0;
			for (int i = N - j - 1; i >= 0; i--) {
				count += tmpMoney / currency[i];
//				System.out.println("count = " + count);
//				System.out.println("tmpMoney = " + tmpMoney);
//				System.out.println("currency = " + currency[i]);
//				System.out.println("=====" + tmpMoney % currency[i]);

				if (tmpMoney >= currency[i]) tmpMoney %= currency[i];
			}
//			System.out.println(tmpMoney);

			if (tmpMoney == 0) queue.add(count);
		}

//		System.out.println(counts);
		bw.write(queue.poll() + "\n");
		bw.flush();
		bw.close();
	}
}
