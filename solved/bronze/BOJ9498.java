import java.io.*;
import java.util.*;

public class BOJ9498 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int score = Integer.parseInt(br.readLine());
		if (score >= 90 && score <= 100) {
			bw.write("A\n");
		} else if (score >= 80 && score < 90) {
			bw.write("B\n");
		} else if (score >= 70 && score < 80) {
			bw.write("C\n");
		} else if (score >= 60 && score < 70) {
			bw.write("D\n");
		} else {
			bw.write("F\n");
		}
		bw.flush();
		bw.close();
	}
}
