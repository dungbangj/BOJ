import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ4740 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		while (true) {
			String input = br.readLine();
			if (input.equals("***")) {
				break;
			}
			char[] inputArr = input.toCharArray();

			for (int i = inputArr.length - 1; i >= 0; i--) {
				sb.append(inputArr[i]);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
