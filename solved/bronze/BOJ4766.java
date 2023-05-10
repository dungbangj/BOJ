import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ4766 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		float tmp = Float.parseFloat(br.readLine());
		while (true) {
			float curInput = Float.parseFloat(br.readLine());
			if (curInput == 999) {
				break;
			}
			float calResult = curInput - tmp;
			tmp = curInput;
			sb.append(String.format("%.2f", calResult)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
