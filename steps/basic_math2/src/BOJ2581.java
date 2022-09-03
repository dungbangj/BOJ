import java.io.*;
import java.util.StringTokenizer;

public class BOJ2581 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          boolean[] priArr = new boolean[10001];
          int i = 2;
          int j;
          priArr[0] = true;
          priArr[1] = true;
          while (i < priArr.length) {
               j = 2;
               while (i * j < priArr.length)
                    priArr[i * j++] = true;
               i++;
          }
          int min = Integer.parseInt(br.readLine());
          int max = Integer.parseInt(br.readLine());
          int flag = 0;
          i = min;
          j = 0;
          while (i <= max) {
               if (flag == 0 && !priArr[i]) {
                    flag = 1;
                    min = i;
                    j += i;
               } else if (!priArr[i])
                    j += i;
               i++;
          }
          if (priArr[min])
               bw.write(-1 + "\n");
          else
               bw.write(j + "\n" + min + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
