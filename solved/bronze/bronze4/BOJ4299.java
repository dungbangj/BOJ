import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ4299 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int diff = Integer.parseInt(st.nextToken());

        int plus = sum + diff;
        int minus = sum - diff;

        if (plus % 2 == 1 || minus % 2 == 1 || minus < 0) {
            sb.append(-1);
        } else {
            sb.append(plus / 2).append(" ").append(minus / 2);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
