import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16134 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long N, R;
    static final long P = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        R = Long.parseLong(st.nextToken());

        long NFacUntilR = 1;
        long RFac = 1;

        for (int i = 0; i < R; i++) {
            NFacUntilR = NFacUntilR * (N - i) % P;
            RFac = RFac * (R - i) % P;
        }

        long formula = (NFacUntilR % P * div(RFac, P - 2) % P) % P;
        System.out.println(formula);
    }

    private static long div(long a, long b) {
        if (b == 1) {
            return a;
        }
        long tmp = div(a, b / 2);
        if (b % 2 == 1) {
            return tmp * tmp % P * a % P;
        } else {
            return tmp * tmp % P;
        }
    }
}
