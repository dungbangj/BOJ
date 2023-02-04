import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2312 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int T;
    static final int MAX = 100_000;
    static boolean[] eratos;
    static ArrayList<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        fillEratos();
        fillPrimes();

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++)
            factorization(Integer.parseInt(br.readLine()));
        System.out.println(sb);
    }

    private static void fillEratos() {
        eratos = new boolean[MAX + 1];
        eratos[0] = eratos[1] = true;
        for (int i = 2; i < Math.sqrt(MAX) + 1; i++) {
            for (int j = i; i * j < MAX; j++)
                eratos[i * j] = true;
        }
    }

    private static void fillPrimes() {
        for (int i = 2; i < eratos.length; i++) {
            if (!eratos[i])
                primes.add(i);
        }
    }

    private static void factorization(int N) {
        int primesIndex = 0, count = 0;
        while (N != 1) {
            Integer onePrime = primes.get(primesIndex);
            if (N % onePrime != 0) {
                primesIndex++;
                count = 0;
                continue;
            }
            N /= onePrime;
            count++;
            if (count > 0 && N % onePrime != 0)
                sb.append(onePrime).append(" ").append(count).append("\n");
        }
    }
}
