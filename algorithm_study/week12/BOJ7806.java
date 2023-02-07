import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ7806 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int n, k;
    static long result;

    public static void main(String[] args) throws IOException {

        String input;
        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            sb.append(gcd()).append("\n");
        }
        System.out.println(sb);
    }

    private static long gcd() {
        if (n >= k) {
            return k;
        }

        result = 1;
        for (int div = 2; div < Math.sqrt(k) + 1; div++) {
            int[] factorCounts = new int[2];
            kFactorization(div, factorCounts);
            if (factorCounts[0] == 0)
                continue;
            checkHowManyUsesInN(div, factorCounts);
            makeResult(div, factorCounts);
        }

        if (1 < k && k <= n)
            result *= k;

        return result;
    }

    private static void kFactorization(int div, int[] factorCounts) {
        while (k % div == 0) {
            factorCounts[0]++;
            k /= div;
        }
    }

    private static void checkHowManyUsesInN(int div, int[] factorCounts) {
        for (int j = div; j <= n; j *= div) {
            factorCounts[1] += n / j;
        }
    }

    private static void makeResult(int div, int[] factorCounts) {
        for (int j = 0; j < Math.min(factorCounts[0], factorCounts[1]); j++)
            result *= div;
    }
}
