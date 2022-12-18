import java.io.*;
import java.util.StringTokenizer;

public class BOJ1978 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          StringTokenizer st = new StringTokenizer(br.readLine());
          boolean[] priArr = new boolean[1001];
          int i = 2;
          int j;
          int count = 0;
          priArr[0] = true;
          priArr[1] = true;
          while (i < priArr.length) {
               j = 2;
               while (i * j < priArr.length)
                    priArr[i * j++] = true;
               i++;
          }
          while (num > 0) {
               int a = Integer.parseInt(st.nextToken());
               if (!priArr[a])
                    count++;
               num--;
          }
          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
