import javax.swing.*;
import java.io.*;
import java.util.*;

public class BOJ11047 {

	static int N, K, count;
	static int[] currency;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = inputNK[0];
		K = inputNK[1];
		int totalMoney = K;

		currency = new int[N];
		for (int i = 0; i < N; i++) {
			currency[i] = Integer.parseInt(br.readLine());
		}

		for (int i = N - 1; i >= 0; i--) {
			if (currency[i] <= totalMoney) {
				int tmpCount = totalMoney / currency[i];
				totalMoney -= tmpCount * currency[i];
				count += tmpCount;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
