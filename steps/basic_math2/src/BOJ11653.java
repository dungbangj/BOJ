import java.io.*;

public class BOJ11653 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int i = 2;
          while (num > 1) {
               if (num % i == 0) {
                    bw.write(i + "\n");
                    num /= i;
               } else
                    i++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
