import java.io.*;
import java.util.Arrays;

/**
 * 고려해야할 것
 * - 투 포인터 사용: 시작과 끝에서 중간으로 모이는 투 포인터가 아닌, 시작과 끝이 같은 지점에서 시작하는 투 포인터
 * - 최악 시간 복잡도: N3
 * - 최선 시간 복잡도: N
 */

public class BOJ2018 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int count = 0;

		/**
		 * 투 포인터 사용
		 *
		 * 순서대로 정렬된 배열에서 사용 가능하다.
		 * 연속되는 값들의 합이 특정 값이 되는 구간의 갯수를 구하는 문제이므로 시작(start)와 마지막(last)이 같은 지점에서 출발한다.
		 * - start가 증가하는 경우: 구간 합이 특정 값을 초과했을 때; start 값을 증가시키면 구간 합 값이 감속한다.
		 * - last가 증가하는 경우: 구간 합이 특정 값 미만일 때; last 값을 증가시키면 구간 합 값이 증가한다.
		 */

		int start = 1;
		int last = start;
		int rangeSum = last;
		while (last <= N) {
//			System.out.println("last = " + last);
//			System.out.println("start = " + start);
//			System.out.println("rangeSum = " + rangeSum);
//			System.out.println();

			if (rangeSum < N) rangeSum += (++last);
			else if (rangeSum > N) rangeSum -= (start++);
			else {
				count++;
				rangeSum += (++last);
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
