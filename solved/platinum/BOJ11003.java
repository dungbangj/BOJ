import java.io.*;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ11003 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int[] inputNL = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = inputNL[0];
		int L = inputNL[1];
		int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		/**
		 * 앞뒤에서 모두 요소를 제거할 수 있는 Deque를 사용한다. 이 문제에서는 앞뒤에 추가하는 특성은 사용할 필요가 없다.
		 */
		Deque<Node> deque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			/**
			 * 굳이 세개를 유지하고 있지 않아도 된다. 비교할 대상 숫자가 이미 덱에 있는 숫자들보다 작다면 모든 숫자가 없어질 수도 있다.
			 */
			while (!deque.isEmpty() && deque.getLast().val > inputNums[i]) {
				deque.removeLast();
			}
			deque.addLast(new Node(inputNums[i], i));

			/**
			 * L은 비교할 숫자의 갯수를 뜻한다. 덱에는 비교할 숫자의 갯수 이상의 수가 없어야하므로 인덱스 범위를 넘어간다면 앞에서부터 없애버린다.
			 * for문이 반복될 때마다 처음 요소를 삭제한다. (L이상의 인덱스부터)
			 */
			if (deque.getFirst().idx <= i - L) deque.removeFirst();
			bw.write(deque.getFirst().val + " ");
		}
		bw.flush();
		bw.close();
	}

	static class Node {
		int val;
		int idx;

		public Node(int val, int idx) {
			this.val = val;
			this.idx = idx;
		}
	}
}
