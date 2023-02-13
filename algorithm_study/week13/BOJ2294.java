import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2294 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] currency;
    static int[] dp;
    static int n, k;

    public static void main(String[] args) throws IOException {
        getInputs();

        fillCurrency();
        fillDP();
        fillDPWithMins();
        printDPK();
    }

    private static void getInputs() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    private static void fillCurrency() throws IOException {
        currency = new int[n];
        for (int i = 0; i < n; i++) {
            currency[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void fillDP() {
        dp = new int[k + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
    }

    private static void fillDPWithMins() {
        for (int i = 0; i < n; i++) {
            for (int j = currency[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[j - currency[i]] + 1);
            }
        }
    }

    private static void printDPK() {
        if (isNotChaged()) {
            System.out.println(-1);
        } else {
            System.out.println(dp[k]);
        }
    }

    private static boolean isNotChaged() {
        return dp[k] == Integer.MAX_VALUE - 1;
    }
}
