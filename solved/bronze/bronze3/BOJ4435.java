import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ4435 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;


	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		int[] gandalf = {1, 2, 3, 3, 4, 10};
		int[] sauron = {1, 2, 2, 2, 3, 5, 10};

		for (int i = 0; i < T; i++) {
			int gandalfScore = sumArmyScore(fillInputArr(), gandalf);
			int sauronScore = sumArmyScore(fillInputArr(), sauron);

//			sb.append(gandalfScore).append(":").append(sauronScore).append("==");

			sb.append("Battle ");
			if (gandalfScore < sauronScore) {
				sb.append(i + 1).append(": Evil eradicates all trace of Good").append("\n");
			} else if (gandalfScore > sauronScore) {
				sb.append(i + 1).append(": Good triumphs over Evil").append("\n");
			} else {
				sb.append(i + 1).append(": No victor on this battle field").append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static int[] fillInputArr() throws IOException {
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[st.countTokens()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		return arr;
	}

	public static int sumArmyScore(int[] arr, int[] army) {
		int totalScore = 0;

		for (int i = 0; i < army.length; i++) {
			totalScore += arr[i] * army[i];
		}
		return totalScore;
	}
}
