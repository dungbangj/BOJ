import java.util.*;
import java.io.*;

public class BOJ2775 {
	public static void main(String[] args) {
		int max = 15;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] dpApartment = new int[max][max];

		for (int i = 1; i < max; i++) {
			dpApartment[0][i] = i;
		}

		try {
			int T = Integer.parseInt(br.readLine());
			for (int test = 0; test < T; test++) {
				int floor = Integer.parseInt(br.readLine());
				int ho = Integer.parseInt(br.readLine());

				for (int i = 1; i <= floor; i++) {
					int hoSum = 0;
					for (int j = 1; j <= ho; j++) {
						hoSum += dpApartment[i - 1][j];
						dpApartment[i][j] = hoSum;
					}
				}
				bw.write(dpApartment[floor][ho] + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
