import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ2309 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int arrSize = arr.length;

		for (int i = 0; i < arrSize - 6; i++) {
			for (int j = i + 1; j < arrSize - 5; j++) {
				for (int k = j + 1; k < arrSize - 4; k++) {
					for (int l = k + 1; l < arrSize - 3; l++) {
						for (int m = l + 1; m < arrSize - 2; m++) {
							for (int n = m + 1; n < arrSize - 1; n++) {
								for (int o = n + 1; o < arrSize; o++) {
									int sum = arr[i] + arr[j] + arr[k] + arr[l] + arr[m] + arr[n] + arr[o];
									if (sum == 100) {
										bw.write(arr[i] + "\n");
										bw.write(arr[j] + "\n");
										bw.write(arr[k] + "\n");
										bw.write(arr[l] + "\n");
										bw.write(arr[m] + "\n");
										bw.write(arr[n] + "\n");
										bw.write(arr[o] + "\n");
										bw.flush();
										bw.close();
										System.exit(0);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
