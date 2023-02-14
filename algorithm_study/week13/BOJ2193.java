import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2193 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long[][] dp;

    public static void main(String args[]) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new long[N + 1][2];

        dp[1][0] = 0;
        dp[1][1] = 1;

        fillDP();

        System.out.println(dp[N][0] + dp[N][1]);
    }

    private static void fillDP() {
        for (int i = 2; i < N + 1; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 1)
                    dp[i][j] = dp[i - 1][0];
                else
                    dp[i][j] = dp[i - 1][0] + dp[i - 1][1];
            }
        }
    }
}
