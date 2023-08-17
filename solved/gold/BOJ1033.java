import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ1033 {

	static int N;
	static long[] nums;
	static ArrayList<ArrayList<Integer>> numConnections = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		nums = new long[N];
		Arrays.fill(nums, 1);

		for (int i = 0; i < N; i++) numConnections.add(new ArrayList<>());

		for (int i = 0; i < N - 1; i++) {
			int[] inputABPQ = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int a = inputABPQ[0];
			int b = inputABPQ[1];
			int p = inputABPQ[2];
			int q = inputABPQ[3];

			long gcd = getGCD(p, q);
			long fractionP = p / gcd;
			long fractionQ = q / gcd;

			makeBigNumWithRate(a, b, fractionP, fractionQ);
//			System.out.println();
//			System.out.println("numConnections = " + numConnections);
		}

//		System.out.println("nums = " + Arrays.toString(nums));
		long gcd = getGCD(nums[0], nums[1]);

		while (gcd > 1) {
			for (int i = 0; i < N; i++) gcd = getGCD(gcd, nums[i]);
			for (int i = 0; i < N; i++) nums[i] /= gcd;
		}

		for (int i = 0;i < N; i++) bw.write(nums[i] + " ");
		bw.flush();
		bw.close();
	}

	private static long getGCD(long a, long b) {
		return b == 0 ? a : getGCD(b, a % b);
	}

	private static void makeBigNumWithRate(int a, int b, long fractionP, long fractionQ) {
		boolean[] visited = new boolean[N];

		long rateMultipliedA = nums[a] * fractionQ;
		long rateMultipliedB = nums[b] * fractionP;

		updateOtherBigNums(a, rateMultipliedB, visited);
		updateOtherBigNums(b, rateMultipliedA, visited);

		numConnections.get(a).add(b);
		numConnections.get(b).add(a);
	}

	private static void updateOtherBigNums(int target, long rateMultipliedNum, boolean[] visited) {

		nums[target] *= rateMultipliedNum;
		visited[target] = true;
		ArrayList<Integer> numConnection = numConnections.get(target);

		for (int connectedNum : numConnection) {
			if (visited[connectedNum]) continue;
			updateOtherBigNums(connectedNum, rateMultipliedNum, visited);
		}
	}
}
