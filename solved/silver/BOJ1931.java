import java.io.*;
import java.util.*;

public class BOJ1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Comparator<SE> comparator = new Comparator<SE>() {
			@Override
			public int compare(SE s1, SE s2) {
				return s1.end != s2.end ? s1.end - s2.end : s1.start - s2.start;
			}
		};

		ArrayList<SE> meetings = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int[] inputSE = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			meetings.add(new SE(inputSE[0], inputSE[1]));
		}
		meetings.sort(comparator);

//		System.out.println(meetings);

		int count = 0;
		SE meeting = new SE(0, 0);

		for (SE curMeeting : meetings) {
//			System.out.println(curMeeting.end + ", " + meeting.start);
			if (curMeeting.start >= meeting.end) {
				meeting = curMeeting;
				count++;
			}
//			System.out.println(meeting);
//			System.out.println(curMeeting);
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	static class SE {
		int start;
		int end;

		public SE(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "start = " + start + ", end = " + end + "\n";
		}
	}
}
