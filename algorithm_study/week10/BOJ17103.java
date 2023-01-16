import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17103 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] inputs;
    static boolean[] primesB;
    static int MAX;

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        saveInputs(T);
        eratosInit();
        goldbach(T);
    }

    private static void saveInputs(int T) throws IOException {
        inputs = new int[T];
        int maxInput = 0;

        for (int i = 0; i < T; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            maxInput = Math.max(inputs[i], maxInput);
        }

        MAX = maxInput;
    }

    private static void eratosInit() {
        primesB = new boolean[MAX + 1];

        for (int i = 2; i < (int)(Math.sqrt(MAX) + 1); i++) {
            if (isPrime(i)) {
                makeNotPrime(i);
            }
        }
    }

    private static void makeNotPrime(int i) {
        for (int j = 2; i * j <= MAX; j++) {
            primesB[i * j] = true;
        }
    }

    private static void goldbach(int T) {
        for (int i = 0; i < T; i++) {
            int N = inputs[i];
            System.out.println(checkHalfOfN(N, 0));
        }
    }

    private static int checkHalfOfN(int N, int count) {
        for (int j = 2; j <= N / 2; j++) {
            if (isGoldbach(N, j)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isGoldbach(int N, int j) {
        return isPrime(j) && isPrime(N - j);
    }

    private static boolean isPrime(int i) {
        return !primesB[i];
    }
}
