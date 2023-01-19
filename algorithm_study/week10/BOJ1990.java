import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1990 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[] nums;
    static int from, to;

    public static void main(String[] args) throws IOException {
        initVariables();
        fillEratos();
        makePalindrome();
        System.out.println(-1);
    }

    private static void initVariables() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        from = Integer.parseInt(st.nextToken());
        to = Integer.parseInt(st.nextToken());

        if (thereIsNoPalindromeOver10_000_000()) {
            to = 10_000_000;
        }
        nums = new boolean[to + 1];
    }

    private static boolean thereIsNoPalindromeOver10_000_000() {
        return to >= 10_000_000;
    }

    private static void fillEratos() {
        for (int i = 2; i < Math.sqrt(to) + 1; i++) {
            for (int j = 2; i * j < to; j++) {
                nums[i * j] = true;
            }
        }
    }

    private static void makePalindrome() {
        for (int i = from; i <= to; i++) {
            if (isFiveOrSeven(i)) {
                System.out.println(i);
            }
            checkPalindrome(i, 0);
        }
    }

    private static void checkPalindrome(int i, int count) {
        String numStr = String.valueOf(i);
        int numStrLen = numStr.length();

        for (int j = 0; j < numStr.length() / 2; j++) {
            if (isSame(numStr, numStrLen, j)) {
                count++;
            }
            if (isPalindromeAndPrime(numStrLen, count, i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPalindromeAndPrime(int numStrLen, int count, int i) {
        return count == numStrLen / 2 && !nums[i];
    }

    private static boolean isSame(String numStr, int numStrLen, int j) {
        return numStr.charAt(j) == numStr.charAt(numStrLen - 1 - j);
    }

    private static boolean isFiveOrSeven(int i) {
        return i == 5 || i == 7;
    }
}
