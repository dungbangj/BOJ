import java.io.*;
import java.time.Year;
import java.util.*;

public class BOJ1717 {
	static int[] arrayList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNM[0];
		int M = inputNM[1];

		arrayList = new int[N + 1];

		for (int i = 0; i <= N; i++) arrayList[i] = i;

//		System.out.println();
//		System.out.println(Arrays.toString(arrayList));

		for (int i = 0; i < M; i++) {
			int[] inputXAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int X = inputXAB[0];
			int A = inputXAB[1];
			int B = inputXAB[2];

			if (X == 0) union(A, B);
			else bw.write(isSameArr(A, B));
		}

//		System.out.println(Arrays.toString(arrayList));

		bw.flush();
		bw.close();
	}

	private static int find(int x) {
		if (x == arrayList[x]) return x;
		return arrayList[x] = find(arrayList[x]);
	}

	private static void union(int A, int B) {
		A = find(A);
		B = find(B);

		if (A < B) arrayList[B] = A;
		else if (A > B) arrayList[A] = B;
	}

	private static String isSameArr(int A, int B) {
		return (find(A) == find(B)) ? "YES\n" : "NO\n";
	}
}
