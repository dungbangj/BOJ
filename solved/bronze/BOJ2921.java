import java.io.*;
import java.lang.*;
import java.util.*;

public class BOJ2921 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		long sum = 0;
		for (int i = 0; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				sum += i + j;
			}
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
}
