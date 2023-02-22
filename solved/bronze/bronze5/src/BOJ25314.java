import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ25314 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N / 4; i++) {
            sb.append("long").append(" ");
        }
        sb.append("int");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
