import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5357 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            char tmp = input[0];
            sb.append(tmp);
            for (int j = 1; j < input.length; j++) {
                if (tmp != input[j]) {
                    tmp = input[j];
                    sb.append(input[j]);
                }
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
