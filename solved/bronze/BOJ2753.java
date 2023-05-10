import java.io.*;
import java.util.*;

public class BOJ2753 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int LEAP_YEAR = 1;
	static int JUST_YEAR = 0;


	public static void main(String[] args) throws IOException {
		int year = Integer.parseInt(br.readLine());

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			bw.write(LEAP_YEAR + "\n");
		} else {
			bw.write(JUST_YEAR + "\n");
		}
		bw.flush();
		bw.close();
	}
}
