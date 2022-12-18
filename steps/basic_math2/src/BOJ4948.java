import java.io.*;

public class BOJ4948 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          boolean[] priArr = new boolean[250000];
          priArr[0] = true;
          priArr[1] = true;
          int i = 2;
          while (i < 250000) {
               int j = 2;
               while (i * j < 250000)
                    priArr[i * j++] = true;
               i++;
          }

          while (true) {
               int num = Integer.parseInt(br.readLine());
               if (num == 0)
                    break;
               int max = num * 2;
               i = num + 1;
               int count = 0;
               while (i <= max) {
                    if (!priArr[i])
                         count++;
                    i++;
               }
               bw.write(count + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
