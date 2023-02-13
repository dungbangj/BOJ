import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13301 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long dp[];
    static final int MAX = 80;

    public static void main(String[] args) throws IOException {

        fillDP();

        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(4);
        } else if (N == 2) {
            System.out.println(6);
        } else {
            System.out.println(2 * (dp[N] + dp[N - 1]) + 2 * (dp[N - 1] + dp[N - 2]));
        }
    }

    private static void fillDP() {
        dp = new long[MAX + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i < MAX + 1; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
    }
}
