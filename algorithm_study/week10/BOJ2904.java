import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2904 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int MAX = 1_000_000;
    static boolean[] eratos;
    static ArrayList<Integer> primes = new ArrayList<>();
    static int count;
    static int result;
    static int[] primeUses = new int[MAX + 1];
    static int[][] inputUses;

    public static void main(String[] args) throws IOException {
        fillEratos();
        fillPrimes();
        fillPrimesAndInputUses();
        getResult();

        System.out.println(result + " " + count);
    }

    private static void fillEratos() {
        eratos = new boolean[MAX + 1];
        for (int i = 2; i < Math.sqrt(MAX) + 1; i++) {
            if (isAlreadyPrime(i)) {
                continue;
            }
            for (int j = i; i * j < MAX + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static boolean isAlreadyPrime(int i) {
        return eratos[i];
    }

    private static void fillPrimes() {
        for (int i = 2; i < MAX + 1; i++) {
            if (!isAlreadyPrime(i)) {
                primes.add(i);
            }
        }
    }

    private static void fillPrimesAndInputUses() throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        inputUses = new int[N][primes.size()];

        for (int i = 0; i < N; i++) {
            int inputNum = Integer.parseInt(st.nextToken());
            for (int j = 0; j < primes.size() && inputNum != 1; j++) {
                int onePrime = primes.get(j);
                while (inputNum % onePrime == 0) {
                    inputNum /= onePrime;
                    primeUses[onePrime]++;
                    inputUses[i][j]++;
                }
            }
        }
    }

    private static void getResult() {
        count = 0;
        result = 1;
        for (int i = 0; i < primes.size(); i++) {
            int onePrime = primes.get(i);
            int usesOfOnePrime = primeUses[onePrime] / N;
            getCount(i, usesOfOnePrime);
            result *= Math.pow(onePrime, usesOfOnePrime);
        }
    }

    private static void getCount(int onePrime, int usesOfOnePrime) {
        for (int j = 0; j < N; j++) {
            if (haveMorePrimesThanAverage(usesOfOnePrime, inputUses[j][onePrime])) {
                count += (usesOfOnePrime - inputUses[j][onePrime]);
            }
        }
    }

    private static boolean haveMorePrimesThanAverage(int usesOfOnePrime, int inputUses) {
        return usesOfOnePrime > inputUses;
    }
}
