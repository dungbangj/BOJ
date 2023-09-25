import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class BOJ17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] ansArr = new int[N];
		int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		ArrayList<Num> nums = new ArrayList<>();

		for (int i = 0; i < inputNums.length; i++) {
			nums.add(new Num(inputNums[i], i));
		}
		int idx = 0;
		Stack<Num> stack = new Stack<>();

		stack.push(nums.get(0));

		while (stack.size() != 0 && idx < inputNums.length) {
			while (!stack.isEmpty() && stack.peek().val < inputNums[idx]) {
				Num poppedNum = stack.pop();
				ansArr[poppedNum.idx] = inputNums[idx];
			}
			stack.push(new Num(inputNums[idx], idx));
			idx++;
		}

		for (Num num : stack) {
			ansArr[num.idx] = -1;
		}

		for (int num : ansArr) {
			bw.write(num + " ");
		}
		bw.flush();
		bw.close();
	}

	static class Num {
		int val;
		int idx;

		public Num(int val, int idx) {
			this.val = val;
			this.idx = idx;
		}
	}
}
