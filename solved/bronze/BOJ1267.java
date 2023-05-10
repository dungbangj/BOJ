import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ1267 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int month = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int YPrice = 0;
		int MPrice = 0;
		while (st.hasMoreTokens()) {
			int use = Integer.parseInt(st.nextToken());
			YPrice += (use / 30 + 1) * 10;
			MPrice += (use / 60 + 1) * 15;
		}
		if (YPrice > MPrice) {
			bw.write("M " + MPrice);
		} else if (YPrice < MPrice) {
			bw.write("Y " + YPrice);
		} else {
			bw.write("Y M " + YPrice);
		}
		bw.flush();
		bw.close();
	}
}
