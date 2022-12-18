import java.io.*;
import java.util.StringTokenizer;

public class BOJ10818 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          StringTokenizer st = new StringTokenizer(br.readLine());
          int max = -1000001;
          int min = 1000001;
          while (num > 0) {
               int a = Integer.parseInt(st.nextToken());
               if (max < a)
                    max = a;
               if (min > a)
                    min = a;
               num--;
          }
          bw.write(min + " " + max);
          br.close();
          bw.flush();
          bw.close();
     }
}
