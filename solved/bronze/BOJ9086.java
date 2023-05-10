import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ9086 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            char[] arr = br.readLine().toCharArray();
            sb.append(arr[0]).append(arr[arr.length - 1]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
