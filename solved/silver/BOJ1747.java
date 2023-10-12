import com.sun.source.tree.NewArrayTree;

import java.io.*;
import java.util.Arrays;

public class BOJ1747 {

	static final int MAX = 1003001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		boolean[] eratosArr = new boolean[MAX + 1];

		makeEratos(eratosArr);

		for (int i = N; i <= MAX; i++) {
			if (eratosArr[i] && isPalindrome(i)) {
				bw.write(i + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}

	static void makeEratos(boolean[] eratosArr) {
		Arrays.fill(eratosArr, true);
		eratosArr[0] = eratosArr[1] = false;
		int max = eratosArr.length - 1;

		for (int i = 2; i * i <= max; i++) {
			if (eratosArr[i]) {
				for (int j = i * i; j <= max; j += i) {
					eratosArr[j] = false;
				}
			}
		}
	}

	static boolean isPalindrome(int num) {
		String strNum = String.valueOf(num);
		String reverNum = new StringBuilder(strNum).reverse().toString();

		return strNum.equals(reverNum);
	}
}
