import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ2876 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] dp = new int[100001][6];
    static Map<Integer, Integer> counts = new HashMap<>();


    public static void main(String[] args) throws Exception {
        new BOJ2876().solution();
    }

    private static void solution() throws Exception {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < 6; i++) {
            counts.put(i, 0);
        }
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int input1 = Integer.parseInt(st.nextToken());
            int input2 = Integer.parseInt(st.nextToken());

            fillDP(i, input1);
            if (haveToCheck2(input1, input2))
                fillDP(i, input2);
        }
        printResult();
    }

    private static void fillDP(int i, int input) {
        dp[i][input] = dp[i - 1][input] + 1;
        counts.put(input, Math.max(counts.get(input), dp[i][input]));
    }

    private static boolean haveToCheck2(int input1, int input2) {
        return input1 != input2;
    }

    private static void printResult() throws IOException {
        int result = 0, resultIdx = 0;
        for (int i = 1; i < 6; i++) {
            if (counts.get(i) > result) {
                result = counts.get(i);
                resultIdx = i;
            }
        }
        sb.append(result).append(" ").append(resultIdx).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
