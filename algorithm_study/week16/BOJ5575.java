import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5575 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int hourStart = Integer.parseInt(st.nextToken());
            int minStart = Integer.parseInt(st.nextToken());
            int secStart = Integer.parseInt(st.nextToken());

            int hourEnd = Integer.parseInt(st.nextToken());
            int minEnd = Integer.parseInt(st.nextToken());
            int secEnd = Integer.parseInt(st.nextToken());

            int sec = secEnd - secStart;
            int min = minEnd - minStart;
            int hour = hourEnd - hourStart;

            if (sec < 0) {
                sec += 60;
                min -= 1;
            }
            if (min < 0) {
                min += 60;
                hour -= 1;
            }
            if (hour < 0) {
                hour += 24;
            }
            sb.append(hour).append(" ").append(min).append(" ").append(sec).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
