import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ5636 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> primes = new ArrayList<>();
    static boolean[] eratos;
    static final int MAX = 100_000;
    static final String END_SIGN = "0";

    public static void main(String[] args) throws IOException {

        fillEratos();
        fillPrimes();
        while (true) {
            String input = br.readLine();
            if (input.equals(END_SIGN))
                break;
            System.out.println(findMaxPrime(input, 0));
        }
    }

    private static void fillEratos() {
        eratos = new boolean[MAX + 1];
        for (int i = 2; i < Math.sqrt(MAX) + 1; i++) {
            for (int j = i; i * j < MAX + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static void fillPrimes() {
        for (int i = 2; i < MAX + 1; i++) {
            if (isPrime(i))
                primes.add(i);
        }
    }

    private static boolean isPrime(int i) {
        return !eratos[i];
    }

    private static int findMaxPrime(String input, int max) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length() && j < i + 6; j++) {
                int subStrToInt = Integer.parseInt(input.substring(i, j));
                if (isPrimeAndBigger(max, subStrToInt))
                    max = subStrToInt;
            }
        }
        return max;
    }

    private static boolean isPrimeAndBigger(int max, int subStrToInt) {
        return primes.contains(subStrToInt) && max < subStrToInt;
    }
}
