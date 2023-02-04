import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1850 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        long inputA = Long.parseLong(st.nextToken());
        long inputB = Long.parseLong(st.nextToken());

        long A = Math.max(inputA, inputB);
        long B = Math.min(inputA, inputB);

        A = GCD(A, B);
        fillOnes(A);
        System.out.println(sb);
    }

    private static long GCD(long A, long B) {
        long remain;

        while (B != 0) {
            remain = A % B;
            A = B;
            B = remain;
        }
        return A;
    }

    private static void fillOnes(long A) {
        for (int i = 0; i < A; i++) {
            sb.append(1);
        }
    }
}
