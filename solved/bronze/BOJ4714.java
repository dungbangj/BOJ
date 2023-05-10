import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ4714 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        while (true) {
            float weight = Float.parseFloat(br.readLine());
            if (weight < 0) {
                break;
            }
            sb.append("Objects weighing ").append(String.format("%.2f", weight)).append(" on Earth will weigh ");
            weight *= 0.167;
            sb.append(String.format("%.2f", weight)).append(" on the moon.").append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
