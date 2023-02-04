import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ9421 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> primes = new ArrayList<>();
    static final int max = 1000000;
    static boolean[] eratos;
    static int n;

    public static void main(String[] args) throws IOException {
        fillEratos();
        fillPrimes();
        findAns();
        System.out.println(sb);
    }

    private static void fillEratos() throws IOException {
        n = Integer.parseInt(br.readLine());
        eratos = new boolean[max + 1];
        for (int i = 2; i < Math.sqrt(max) + 1; i++) {
            for (int j = i; i * j < max + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static void fillPrimes() {
        for (int i = 2; i < n + 1; i++) {
            if (!eratos[i])
                primes.add(i);
        }
    }

    private static void findAns() {
        for (Integer onePrime : primes) {
            ArrayList<Integer> sums = new ArrayList<>();
            int sum = calSum(makeNumToStr(onePrime), 0);
            sums.add(sum);
            sum = calUntilOne(sums, sum);
            if (sum == 1)
                sb.append(onePrime).append("\n");
        }
    }

    private static int calUntilOne(ArrayList<Integer> sums, int sum) {
        while (sum != 1) {
            sum = calSum(makeNumToStr(sum), 0);
            if (sums.contains(sum))
                break;
            sums.add(sum);
        }
        return sum;
    }

    private static String makeNumToStr(Integer onePrime) {
        return onePrime + "";
    }

    private static int calSum(String onePrimeStr, int sum) {
        for (int i = 0; i < onePrimeStr.length(); i++) {
            sum += Math.pow(onePrimeStr.charAt(i) - '0', 2);
        }
        return sum;
    }
}
