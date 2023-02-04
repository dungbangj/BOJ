import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ13241 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long A, B, max;
    static boolean[] eratos;
    static ArrayList<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        initInputs();
        fillEratos();
        fillPrimes();
        long mul = factorization();
        System.out.println(mul * A * B);
    }

    private static void initInputs() throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        max = Math.max(A, B);
        eratos = new boolean[(int) (max + 1)];
    }

    private static void fillEratos() {
        eratos[0] = eratos[1] = true;
        for (int i = 2; i < Math.sqrt(max) + 1; i++) {
            for (int j = i; i * j < max + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static void fillPrimes() {
        for (int i = 0; i < max + 1; i++) {
            if (!eratos[i]) {
                primes.add(i);
            }
        }
    }

    private static long factorization() {
        long mul = 1;
        for (Integer prime : primes) {
            while (A % prime == 0 && B % prime == 0) {
                mul *= prime;
                A /= prime;
                B /= prime;
            }
        }
        return mul;
    }
}