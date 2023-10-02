import java.io.*;
import java.util.Arrays;

public class BOJ1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] inputBase = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(inputBase);

		int M = Integer.parseInt(br.readLine());
		int[] inputComp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

//		System.out.println("inputBase = " + Arrays.toString(inputBase));
//		System.out.println("inputComp = " + Arrays.toString(inputComp));
		for (int compNum : inputComp) {
			if (binarySearch(compNum, inputBase)) bw.write("1\n");
			else bw.write("0\n");
		}
		bw.flush();
		bw.close();
	}

	static boolean binarySearch(int num, int[] inputBase) {
		int low = 0;
		int high = inputBase.length - 1;
		int mid, midBaseNum;

		while (low <= high) {
			mid = (low + high) / 2;
			midBaseNum = inputBase[mid];

			if (num < midBaseNum) high = mid - 1;
			else if (num > midBaseNum) low = mid + 1;
			else {
				return true;
			}
		}
		return false;
	}
}
