import java.io.*;
import java.util.*;

public class BOJ1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] inputBaseMinus = br.readLine().split("-");
		ArrayList<Integer> partSums = new ArrayList<>();

		for (String baseMinus : inputBaseMinus) {
			String[] inputBasePlus = baseMinus.split("\\+");
			int partSum = 0;
			for (String basePlus : inputBasePlus) {
				partSum += Integer.parseInt(basePlus);
			}
			partSums.add(partSum);
		}

//		System.out.println("partSums = " + partSums);

		int result = partSums.get(0);
		for (int i = 1; i < inputBaseMinus.length; i++) {
			result -= partSums.get(i);
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}
