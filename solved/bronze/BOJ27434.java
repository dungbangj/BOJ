import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ27434 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        long N = Integer.parseInt(br.readLine());
        BigInteger mul = new BigInteger("1");
        for (int i = 1; i <= N / 2; i++) {
            mul = mul.multiply(BigInteger.valueOf(i * (N - i + 1)));
        }
        if (N % 2 == 1) {
            mul = mul.multiply(BigInteger.valueOf(N / 2 + 1));
        }
        bw.write(String.valueOf(mul));
        bw.flush();
        bw.close();
    }
}
