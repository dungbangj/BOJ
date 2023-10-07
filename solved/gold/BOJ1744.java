import java.io.*;
import java.util.*;

public class BOJ1744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Queue<Integer> zeros = new LinkedList<>();

		Comparator<Integer> minusComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};

		PriorityQueue<Integer> minus = new PriorityQueue<>();
		PriorityQueue<Integer> plus = new PriorityQueue<>(minusComparator);

		for (int i = 0; i < N; i++) {
			int inputNum = Integer.parseInt(br.readLine());
			if (inputNum == 0) zeros.add(inputNum);
			else if (inputNum < 0) minus.add(inputNum);
			else plus.add(inputNum);
		}

//		while (!plus.isEmpty()) {
//			System.out.println(plus.poll());
//		}

//		System.out.println("minus = " + minus);
//		System.out.println("zeros = " + zeros);
//		System.out.println("plus = " + plus);

		long totalSum = 0;

		while (minus.size() > 1) {
			int polledNum1 = minus.poll();
			int polledNum2 = minus.poll();
//			System.out.println("polledNum1 = " + polledNum1);
//			System.out.println("polledNum2 = " + polledNum2);
			totalSum += (polledNum1 * polledNum2);
		}

		while (zeros.size() > 0) {
			if (minus.size() == 1) {
				zeros.poll();
				minus.poll();
			} else {
				zeros.poll();
			}
		}

		while (plus.size() > 1) {
			int polledNum1 = plus.poll();
			int polledNum2 = plus.poll();

			int twoPlus = polledNum1 + polledNum2;
			int twoMultiple = polledNum1 * polledNum2;
			totalSum += (Math.max(twoPlus, twoMultiple));
		}

		if (!plus.isEmpty()) totalSum += plus.poll();
		if (!minus.isEmpty()) totalSum += minus.poll();

		bw.write(totalSum + "\n");
		bw.flush();
		bw.close();
	}
}
