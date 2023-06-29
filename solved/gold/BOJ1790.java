import java.io.*;
import java.util.Scanner;

public class BOJ1790 {

	static int NINE = 9;
	static int TEN = 10;
	static int num = 1;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		long K = Long.parseLong(input[1]);
		long tmpK = K;
		while (true) {
			int range = NINE * ((int)Math.pow(TEN, num - 1)) * num;
			if (tmpK - range > 0) {
				tmpK -= range;
				num++;
			} else {
				num--;
				range = NINE * ((int)Math.pow(TEN, num - 1)) * num;
				num++;
				double newNum = tmpK / (double)num;
				int almostAns = range + (int)newNum;
				if (newNum - (int) newNum != 0) {
					almostAns += 1;
				}
				char[] STRAlmostAns = String.valueOf(almostAns).toCharArray();

				int mod = (int) (num - tmpK % num - 1);
//				System.out.println(STRAlmostAns[0] + " " + STRAlmostAns[1]);
//				System.out.println("almostAns = " + almostAns);
//				System.out.println("mod = " + mod);
				if (almostAns > N) {
					System.out.println(-1);
					System.exit(-1);
				}
				System.out.println(STRAlmostAns[mod]);
				break;
			}
		}
	}
}