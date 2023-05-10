import java.io.*;
import java.math.*;
import java.util.*;

public class BOJ10869 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] main) throws IOException {

		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		bw.write(A + B + "\n");
		bw.write(A - B + "\n");
		bw.write(A * B + "\n");
		bw.write(A / B + "\n");
		bw.write(A % B + "\n");
		bw.flush();
		bw.close();
	}
}
