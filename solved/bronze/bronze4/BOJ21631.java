import java.io.*;
import java.util.*;

public class BOJ21631 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long white = Long.parseLong(st.nextToken());
		long black = Long.parseLong(st.nextToken());

		long res = (white >= black) ? black : white + 1;
		System.out.println(res);
	}
}