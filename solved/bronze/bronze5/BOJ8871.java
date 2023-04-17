import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ8871 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int n = Integer.parseInt(br.readLine());
        sb.append((n + 1) * 2).append(" ");
        sb.append((n + 1) * 3);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
