import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2530 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int[] inputs = new int[3];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        int secs = Integer.parseInt(br.readLine());
        for (int i = 2; i > 0; i--) {
            inputs[i] += secs % 60;
            if (inputs[i] >= 60) {
                inputs[i] -= 60;
                inputs[i - 1] += 1;
            }
            secs /= 60;
        }
        inputs[0] += secs;
        if (inputs[0] >= 24) {
            inputs[0] %= 24;
        }

        sb.append(inputs[0]).append(" ").append(inputs[1]).append(" ").append(inputs[2]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
