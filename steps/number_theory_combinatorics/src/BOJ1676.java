import java.io.*;

public class BOJ1676 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int count = 0;
          while (num >= 5) {
               count += num / 5;
               num /= 5;
          }
          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
