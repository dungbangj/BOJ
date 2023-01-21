import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ16563 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] inputs;
    static boolean[] nums;
    static ArrayList<Integer> primes = new ArrayList<>();
    static int max = 5000000;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        inputs = new int[N];
        nums = new boolean[max + 1];

        getInputs(N);
        eratos();
        fillPrimes();

        int[] inputSqrt = makeInputSqrt();

        makeResult(inputSqrt);
        System.out.print(sb);
    }

    private static void makeResult(int[] inputSqrt) {
        for (int i = 0; i < inputSqrt.length; i++) {
            if (!nums[inputs[i]]) {
                sb.append(inputs[i]).append("\n");
                continue;
            }

            int flag = 0;

            for (int onePrime : primes) {
                if (onePrime > inputSqrt[i]) {
                    break;
                }
                while (inputs[i] % onePrime == 0) {
                    sb.append(onePrime).append(" ");
                    inputs[i] /= onePrime;
                    if (!nums[inputs[i]]) {
                        sb.append(inputs[i]).append(" ");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1)
                    break;
            }
            sb.append("\n");
        }
    }

    private static int[] makeInputSqrt() {
        int[] inputSqrt = new int[inputs.length];

        for (int i = 0; i < inputs.length; i++) {
            inputSqrt[i] = (int)Math.sqrt(inputs[i]) + 1;
        }
        return inputSqrt;
    }

    private static void getInputs(int N) {
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void fillPrimes() {
        for (int i = 2; i <= max; i++) {
            if (!nums[i]) {
                primes.add(i);
            }
        }
    }

    private static void eratos() {
        nums[0] = nums[1] = true;
        for (int i = 2; i <= (int) Math.sqrt(max); i++) {
            if (nums[i])
                continue;
            for (int j = 2; i * j <= max; j++) {
                nums[i * j] = true;
            }
        }
    }

}
