import java.io.*;

public class BOJ2439 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int i = 1;
          int j;
          while (i <= num) {
               j = 0;
               while (j < num - i) {
                    bw.write(" ");
                    j++;
               }
               while (j < num) {
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
