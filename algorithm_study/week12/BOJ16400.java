import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ16400 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int MAX = 40_000;
    static final int MOD = 123_456_789;
    static boolean[] eratos;
    static int[] dp;
    static ArrayList<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        fillEratos();
        fillPrimes();
        int N = Integer.parseInt(br.readLine());
        fillDp(N);
        System.out.println(dp[N]);
    }

    private static void fillEratos() {
        eratos = new boolean[MAX + 1];
        eratos[0] = eratos[1] = true;
        for (int i = 2; i < Math.sqrt(MAX) + 1; i++) {
            for (int j = i; i * j < MAX + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static void fillPrimes() {
        for (int i = 2; i < MAX + 1; i++) {
            if (!eratos[i]) {
                primes.add(i);
            }
        }
    }

    private static void fillDp(int N) {
        dp = new int[N + 1];
        dp[0] = 1;
        for (int onePrime : primes) {
            for (int i = onePrime; i < N + 1; i++) {
                dp[i] = (dp[i] + dp[i - onePrime]) % MOD;
            }
            if (onePrime > N + 1) {
                break;
            }
        }
    }
}
