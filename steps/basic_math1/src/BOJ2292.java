import java.io.*;

public class BOJ2292 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int min = 1;
          int max = 1;
          int val = 1;

          for (int i = 1;; i++) {
               if (min <= num && num <= max) {
                    bw.write(val + "\n");
                    break;
               }
               min = max + 1;
               max = max + i * 6;
               val++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
