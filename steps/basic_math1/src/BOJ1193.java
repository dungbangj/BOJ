import java.io.*;
import java.nio.Buffer;

public class BOJ1193 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int i = 1;
          while (num > 0)
               num -= i++;
          i--;
          num += i;
          if (i % 2 == 0) {
               bw.write(num + "/" + (i - (num - 1)));
          } else {
               bw.write((i - (num - 1)) + "/" + num);
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
