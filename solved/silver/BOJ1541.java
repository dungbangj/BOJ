import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Character> pmArr = new ArrayList<>();
		ArrayList<Integer> numArr = new ArrayList<>();
		String inputLine = br.readLine();

		int[] inputNums = Arrays.stream(inputLine.split("[+\\-]")).mapToInt(Integer::parseInt).toArray();

		if (inputNums.length == 1) {
			bw.write(inputNums[0] + "\n");
			bw.flush();
			bw.close();
			System.exit(0);
		}
		for (char pm : inputLine.toCharArray()) {
			if (pm == '+' || pm == '-') pmArr.add(pm);
		}

		for (int i = 0; i < pmArr.size(); i++) {
			if (pmArr.get(i) == '+') {
				int tmpSum = inputNums[i];

				for (int j = i; j < inputNums.length; j++) {

					if (pmArr.size() > j &&pmArr.get(j) == '+') {
						tmpSum += inputNums[j + 1];
						i = j;
					} else {
						i = j;
						break;
					}
				}
				numArr.add(tmpSum);
			} else {
				numArr.add(inputNums[i]);
			}
		}

//		System.out.println(numArr);
		if (pmArr.get(pmArr.size() - 1) == '-') numArr.add(inputNums[inputNums.length - 1]);
//		System.out.println(numArr);

		int result = numArr.get(0);
		for (int i = 1; i < numArr.size(); i++) {
			result -= numArr.get(i);
		}
//		System.out.println(result);
//		System.out.println(numArr);

		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}
