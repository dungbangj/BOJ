import java.io.*;

public class BOJ2775 {

     public static int returningI(int k, int n) {
          if (n == 1)
               return (1);
          else if (n == 0)
               return (0);
          if (k == 0)
               return (n);
          return (returningI(k - 1, n) + returningI(k, n - 1));
     }

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());

          while (num > 0) {
               int k = Integer.parseInt(br.readLine());
               int n = Integer.parseInt(br.readLine());
               bw.write(returningI(k, n) + "\n");
               num--;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
