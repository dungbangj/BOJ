import java.io.*;

public class BOJ1436_v2 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int res = 665;
          int a = 0;
          while (true) {
               if (a == num) {
                    bw.write(res + "\n");
                    break;
               }
               res++;
               int i = 0;
               while (i <= 10) {
                    if (res / my_pow(10, i) % 1000 == 666) {
                         a++;
                         break;
                    }
                    i++;
               }
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int my_pow(int a, int b) {
          int res = 1;

          if (b == 0)
               return 1;
          while (b > 0) {
               res *= a;
               b--;
          }
          return res;
     }
}
