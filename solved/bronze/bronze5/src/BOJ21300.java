import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ21300 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        bw.write(sum * 5 + "\n");
        bw.flush();
        bw.close();
    }

}
