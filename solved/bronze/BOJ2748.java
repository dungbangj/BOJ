import java.util.*;
import java.io.*;

public class BOJ2748 {
	public static void main(String[] args) {
		long[] dpFibo = new long[100];
		dpFibo[0] = 0;
		dpFibo[1] = 1;
		dpFibo[2] = 1;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());

			for (int i = 3; i <= n; i++) {
				dpFibo[i] = dpFibo[i - 1] + dpFibo[i - 2];
			}
			bw.write(dpFibo[n] + "\n");
			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
