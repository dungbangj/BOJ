import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2011 {

    static final int MOD = 1_000_000;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] inputCodeNum, dp;

    public static void main(String[] args) throws IOException {
        BOJ2011.solution();
    }

    private static void solution() throws IOException {
        makeInputNum();
        System.out.println(dp());
    }

    private static void makeInputNum() throws IOException {
        char[] inputCode = br.readLine().toCharArray();
        inputCodeNum = new int[inputCode.length];
        for (int i = 0; i < inputCode.length; i++) {
            inputCodeNum[i] = inputCode[i] - '0';
        }
    }

    private static int dp() {
        dp = new int[inputCodeNum.length + 1];
        dp[0] = dp[1] = 1;
        if (zeroBeforeNum(0, 0))
            return 0;
        for (int i = 2; i <= inputCodeNum.length; i++) {
            if (isNotConvertable(i)) {
                if (zeroBeforeNum(i, 1))
                    return 0;
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 2];
                if (!zeroBeforeNum(i, 1))
                    dp[i] = (dp[i] + dp[i - 1]) % MOD;
            }
        }
        return dp[inputCodeNum.length];
    }

    private static boolean isNotConvertable(int i) {
        return inputCodeNum[i - 2] * 10 + inputCodeNum[i - 1] > 26 || zeroBeforeNum(i, 2);
    }

    private static boolean zeroBeforeNum(int i, int x) {
        return inputCodeNum[i - x] == 0;
    }

}
