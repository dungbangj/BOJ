import java.io.*;

public class BOJ2562 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringBuilder sb = new StringBuilder();
          String str;
          int i = 1;
          int maxi = 0;
          int max = 0;
          while (true) {
               str = br.readLine();
               if (str == null)
                    break;
               int a = Integer.parseInt(str);
               if (a > max) {
                    max = a;
                    maxi = i;
               }
               i++;
          }
          bw.write(max + "\n" + maxi);
          br.close();
          bw.flush();
          bw.close();
     }
}
