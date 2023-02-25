import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5717 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        while (true) {
            st = new StringTokenizer(br.readLine());
            int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if (result == 0) break;
            sb.append(result).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
