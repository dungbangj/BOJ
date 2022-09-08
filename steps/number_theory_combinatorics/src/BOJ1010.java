import java.io.*;
import java.util.StringTokenizer;

public class BOJ1010 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          for (int i = 0; i < num; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int N = Integer.parseInt(st.nextToken());
               int M = Integer.parseInt(st.nextToken());
               if (N == 1) bw.write(M + "\n");
               else if (N == M) {
                    bw.write(1 + "\n");
               } else {
                    bw.write(My_Factorial(M - (N - 1)) + "\n");
               }
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int My_Factorial(int a) {
          if (a == 0) return 1;
          return (a * My_Factorial(a - 1));
     }
}
