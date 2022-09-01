import java.io.*;

public class BOJ1110 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int tmp = num;
          int count = 0;
          while (true) {
               num = 10 * (num % 10) + (num / 10 + num % 10) % 10;
               count++;
               if (tmp == num) {
                    bw.write(count + "\n");
                    break;
               }
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
