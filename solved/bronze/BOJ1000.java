import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

public class BOJ1000 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		bw.write(A + B + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
