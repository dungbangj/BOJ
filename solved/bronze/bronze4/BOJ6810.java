import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ6810 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        StringBuilder fixed = new StringBuilder("9780921418");
        for (int i = 0; i < 3; i++) {
            fixed.append(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < fixed.length(); i++) {
            if (i % 2 == 0) {
                sum += fixed.charAt(i) - '0';
            }
            if (i % 2 == 1) {
                sum += (fixed.charAt(i) - '0') * 3;
            }
        }
        sb.append("The 1-3-sum is ").append(sum).append("\n");
        bw.write(sb.toString());
        clearBuffer();
    }

    private static void clearBuffer() throws IOException {
        br.close();
        bw.flush();
        bw.close();
    }
}
