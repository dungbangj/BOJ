import java.io.*;
import java.util.*;

public class BOJ9372 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int T, N, M;

	public static void main(String[] args) throws IOException {

		T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");

			N = Integer.parseInt(input[0]);
			M = Integer.parseInt(input[1]);
			Country[] countries = new Country[N + 1];

			for (int j = 1; j <= N; j++) {
				Country country = new Country(j);
				countries[j] = country;
			}

			for (int j = 0; j < M; j++) {
				String[] countryInput = br.readLine().split(" ");
				int a = Integer.parseInt(countryInput[0]);
				int b = Integer.parseInt(countryInput[1]);

				countries[a].addToCountry(b);
				countries[b].addToCountry(a);
			}
			System.out.println(N - 1);
		}
	}
}

class Country {
	int from;
	ArrayList<Integer> to = new ArrayList<>();

	public Country(int from) {
		this.from = from;
	}

	public void addToCountry(int b) {
		to.add(b);
	}
}
