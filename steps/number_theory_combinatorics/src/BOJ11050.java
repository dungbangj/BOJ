import java.io.*;
import java.util.StringTokenizer;

public class BOJ11050 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int N = Integer.parseInt(st.nextToken());
          int K = Integer.parseInt(st.nextToken());
          if (0 <= K && K <= N)
               bw.write(My_Factorial(N) / (My_Factorial(K) * My_Factorial(N - K)) + "\n");
          else
               bw.write(0 + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static int My_Factorial(int a) {
          if (a == 0) return 1;
          return (a * My_Factorial(a - 1));
     }
}
