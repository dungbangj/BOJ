import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ4696 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        while (true) {
            float wives = Float.parseFloat(br.readLine());
            if (wives == 0) {
                break;
            }
            float sum = 0;
            for (int i = 0; i < 5; i++) {
                sum  += Math.pow(wives, i);
            }
            sb.append(String.format("%.2f", sum)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
