import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ16099 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            BigInteger A = new BigInteger(st.nextToken()).multiply(new BigInteger(st.nextToken()));
            BigInteger B = new BigInteger(st.nextToken()).multiply(new BigInteger(st.nextToken()));
            if (A.compareTo(B) < 0) {
                bw.write("Eurecom\n");
            } else if (A.compareTo(B) > 0) {
                bw.write("TelecomParisTech\n");
            } else {
                bw.write("Tie\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
