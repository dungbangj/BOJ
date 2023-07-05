import java.io.*;
import java.util.*;

public class BOJ9934 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
	static int K;
	public static void main(String[] args) throws IOException {

		K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			arrayList.add(new ArrayList<>());
		}

		String[] input = br.readLine().split(" ");
		int inputLen = input.length;

		recur(inputLen, input, 1);

		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < arrayList.get(i).size(); j++) {
				bw.write(arrayList.get(i).get(j) + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static void recur(int len, String[] arr, int depth) {
		if (depth == K + 1) {
			return;
		}

		arrayList.get(depth - 1).add(Integer.valueOf(arr[arr.length / 2]));
		String[] slice1 = Arrays.copyOfRange(arr, 0, len / 2);
		String[] slice2 = Arrays.copyOfRange(arr, len / 2 + 1, len);
		recur(len / 2, slice1, depth + 1);
		recur(len / 2, slice2, depth + 1);
	}
}
