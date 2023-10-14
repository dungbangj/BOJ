import java.io.*;

public class BOJ11689 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Long.parseLong(br.readLine());
		long phi = n;

		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) phi -= phi / i;
			while (n % i == 0) n /= i;
		}

		if (n != 1) phi -= phi / n;
		bw.write(phi + "\n");
		bw.flush();
		bw.close();
	}
}
