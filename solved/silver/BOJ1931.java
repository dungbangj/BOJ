import java.io.*;
import java.util.*;

public class BOJ1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Meeting> meetings = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int[] inputTimes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int startTime = inputTimes[0];
			int endTime = inputTimes[1];

			meetings.add(new Meeting(startTime, endTime));
		}

//		System.out.println("meetings = " + meetings);

		int count = 0;
		Meeting meeting = new Meeting(0, 0);

		while (!meetings.isEmpty()) {
			Meeting currentMeeting = meetings.poll();
			if (meeting.endTime <= currentMeeting.startTime) {
				meeting = currentMeeting;
				count++;
//				System.out.println("currentMeeting = " + currentMeeting);
			}
		}

		bw.write(count+ "\n");
		bw.flush();
		bw.close();
	}

	static class Meeting implements Comparable<Meeting>{
		int startTime;
		int endTime;

		public Meeting(int startTime, int endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}

		@Override
		public int compareTo(Meeting anotherMeeting) {
			int result = Integer.compare(this.endTime, anotherMeeting.endTime);
			if (result == 0) {
				return Integer.compare(this.startTime, anotherMeeting.startTime);
			}
			return result;
		}

		@Override
		public String toString() {
			return "{startTime=" + startTime + ", endTime=" + endTime + "}\n";
		}
	}
}
