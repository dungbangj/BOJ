import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11576 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long A, B, N, sum;

    public static void main(String[] args) throws IOException {
        makeDecimal(fillInputs());
        printReverse(makeAtoB());
    }

    private static Long[] fillInputs() throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        N = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());
        Long[] inputs = new Long[(int) N];
        for (int i = 0; i < N; i++) {
            inputs[i] = Long.parseLong(st.nextToken());
        }
        return inputs;
    }

    private static void makeDecimal(Long[] inputs) {
        int index = 0;
        sum = 0;
        for (long i = N - 1; i >= 0; i--) {
            sum += inputs[index++] * Math.pow(A, i);
        }
    }

    private static ArrayList<Long> makeAtoB() {
        ArrayList<Long> baseB = new ArrayList<>();
        while (sum / B > 0) {
            baseB.add(sum % B);
            sum /= B;
        }
        baseB.add(sum % B);
        return baseB;
    }

    private static void printReverse(ArrayList<Long> baseB) {
        for (int i = baseB.size() - 1; i >= 0; i--) {
            System.out.print(baseB.get(i) + " ");
        }
    }
}
