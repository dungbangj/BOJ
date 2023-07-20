import java.io.*;
import java.util.*;
import java.util.concurrent.BlockingDeque;

public class BOJ1377 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Comp[] arr = new Comp[N];

		for (int i = 0; i < N; i++) {
			arr[i] = new Comp(Integer.parseInt(br.readLine()), i);
		}
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		int max = 0;
		for (int i = 0; i < N; i++) {
			if (max < arr[i].idx - i) {
				max = arr[i].idx - i;
			}
		}
		bw.write(max + 1 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static class Comp implements Comparable<Comp> {
		int val;
		int idx;

		Comp(int val, int idx) {
			this.val = val;
			this.idx = idx;
		}

		@Override
		public int compareTo(Comp o) {
			return this.val - o.val;
		}
	}

}
