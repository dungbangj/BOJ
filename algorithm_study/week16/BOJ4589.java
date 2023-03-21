import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ4589 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] inputs;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int N = Integer.parseInt(br.readLine());
        sb.append("Gnomes:\n");
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            inputs = new int[3];
            for (int j = 0; j < 3; j++) {
                inputs[j] = Integer.parseInt(st.nextToken());
            }
            if (isOrdered(0, 1, 2) || isOrdered(2, 1, 0)) {
                sb.append("Ordered\n");
            } else {
                sb.append("Unordered\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isOrdered(int i, int j, int k) {
        return inputs[i] < inputs[k] && inputs[j] < inputs[k] && inputs[i] < inputs[j];
    }

}
