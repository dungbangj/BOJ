import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11052 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int[] cardPacks = new int[N + 1];
        int[] dp = new int[N + 1];

        fillCardPacks(N, cardPacks);
        fillDP(N, cardPacks, dp);
        System.out.println(dp[N]);
    }

    private static void fillCardPacks(int N, int[] cardPacks) throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 1;i <= N; i++) {
            cardPacks[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void fillDP(int N, int[] cardPacks, int[] dp) {
        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + cardPacks[j]);
            }
        }
    }
}
