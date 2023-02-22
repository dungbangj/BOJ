import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ27219 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        int N = Integer.parseInt(br.readLine());
        int V = N / 5;
        int I = N % 5;
        for (int i = 0; i < V; i++) {
            sb.append("V");
        }
        for (int i = 0; i < I; i++) {
            sb.append("I");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
