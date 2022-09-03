import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ10757 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          String one = st.nextToken();
          String two = st.nextToken();

          BigInteger bigInteger1 = new BigInteger(one);
          BigInteger bigInteger2 = new BigInteger(two);
          bw.write(bigInteger1.add(bigInteger2) + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
