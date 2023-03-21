import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5928 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken()) - 11;
        int hour = Integer.parseInt(st.nextToken()) - 11;
        int min = Integer.parseInt(st.nextToken()) - 11;
        if (min < 0) {
            min += 60;
            hour -= 1;
        }
        if (hour < 0) {
            hour += 24;
            day -= 1;
        }
        int result = min + hour * 60 + day * 24 * 60;
        if (day < 0) {
            result = -1;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}
