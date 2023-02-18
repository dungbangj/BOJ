import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ25644 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void solution() throws Exception {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            answer = Math.max(answer, input - min);
            min = Math.min(min, input);
        }
        sb.append(answer).append("\n");

        printAnswer();
    }

    private static void printAnswer() throws IOException {
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new BOJ25644().solution();
    }
}
