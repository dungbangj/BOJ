import java.io.*;

public class BOJ2438 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int i = 1;
          int j;
          while (i <= num) {
               j = 0;
               while (j < i) {
                    bw.write("*");
                    j++;
               }
               bw.newLine();
               i++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
