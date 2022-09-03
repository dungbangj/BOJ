import java.io.*;

public class BOJ2839 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int count = 0;
          while (num > 0) {
               if (num % 5 == 0) {
                    count += num / 5;
                    num = 0;
                    break;
               }
               num -= 3;
               count++;
          }
          if (num != 0)
               bw.write(-1 + "\n");
          else if (num == 0)
               bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
