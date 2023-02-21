import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5597 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        boolean[] arr = new boolean[31];
        arr[0] = true;
        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())] = true;
        }
        for (int i = 0; i < 31; i++) {
            if (!arr[i]) {
                sb.append(i).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
