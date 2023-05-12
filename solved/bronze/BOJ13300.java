import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ13300 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int students = Integer.parseInt(st.nextToken());
		int maxRoom = Integer.parseInt(st.nextToken());
		int[] girlRooms = new int[7];
		int[] boyRooms = new int[7];

		for (int i = 0; i < students; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());

			if (gender == 0) {
				girlRooms[grade]++;
			} else {
				boyRooms[grade]++;
			}
		}

		double sum = 0;
		for (int i = 1; i < 7; i++) {
			sum += Math.ceil((double) girlRooms[i] / maxRoom);
			sum += Math.ceil((double) boyRooms[i] / maxRoom);
		}
		bw.write((int)sum + "\n");
		bw.flush();
		bw.close();
	}
}
