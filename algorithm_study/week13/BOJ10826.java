import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ10826 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");

        if (n == 0) {
            System.out.println(0);
            return;
        }
        while (n - 1 > 0) {
            BigInteger sum = a.add(b);
            a = b;
            b = sum;
            n--;
        }
        System.out.println(b);
    }
}
