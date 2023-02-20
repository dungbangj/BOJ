import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ9465 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] dp, stickers;

    public static void main(String[] args) throws IOException {
        new BOJ9465().solution();
    }

    private static void solution() throws IOException {
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            stickers = fillStickers(new int[2][n], n);
            fillDPFirst(n);
            fillDP(n);
            sb.append(Math.max(dp[0][n - 1], dp[1][n - 1])).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int[][] fillStickers(int[][] stickers, int n) throws IOException {
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                stickers[i][j] = Integer.parseInt(st.nextToken());
        }
        return stickers;
    }

    private static void fillDPFirst(int n) {
        dp = new int[2][n];
        dp[0][0] = stickers[0][0];
        dp[1][0] = stickers[1][0];
        if (n > 1) {
            dp[0][1] = stickers[0][1] + dp[1][0];
            dp[1][1] = stickers[1][1] + dp[0][0];
        }
    }

    private static void fillDP(int n) {
        for (int j = 2; j < n; j++) {
            dp[0][j] = Math.max(dp[1][j - 1] + stickers[0][j], dp[1][j - 2] + stickers[0][j]);
            dp[1][j] = Math.max(dp[0][j - 1] + stickers[1][j], dp[0][j - 2] + stickers[1][j]);
        }
    }
}
