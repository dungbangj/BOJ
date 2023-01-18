import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1456 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Long> primes = new ArrayList<>();
    static long A, B;
    static int[] nums;

    public static void main(String[] args) throws IOException {

        initRange();
        makeNotPrimeOne();
        fillPrimes();
        System.out.println(almostPrimes());

    }

    private static void initRange() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        nums = new int[(int) (Math.sqrt(B) + 1)];
    }

    private static void makeNotPrimeOne() {
        nums[1] = 1;
        for (int i = 2; i < (int)(Math.sqrt(B) + 1); i++) {
            for (int j = 2; i * j < (int)(Math.sqrt(B) + 1); j++) {
                nums[i * j] = 1;
            }
        }
    }

    private static void fillPrimes() {
        for (long i = 2; i < nums.length; i++) {
            if (isPrime((int) i)) {
                primes.add(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        return nums[i] == 0;
    }

    private static int almostPrimes() {
        int count = 0;
        for (Long prime : primes) {
            for (int j = 2; Math.pow(prime, j) <= B; j++) {
                if (isOverA(prime, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isOverA(Long prime, int j) {
        return A <= Math.pow(prime, j);
    }
}
