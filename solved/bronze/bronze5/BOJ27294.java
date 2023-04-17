import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ27294 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        if (12 <= T && T <= 16 && S == 0) {
            bw.write("320");
        } else {
            bw.write("280");
        }

        bw.flush();
        bw.close();
    }

}
