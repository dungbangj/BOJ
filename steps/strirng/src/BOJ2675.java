import java.io.*;
import java.util.StringTokenizer;

public class BOJ2675 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());

          while (0 < num) {
               int i = 0;
               StringTokenizer st = new StringTokenizer(br.readLine());
               int iterNum = Integer.parseInt(st.nextToken());
               char[] iterAlpha = st.nextToken().toCharArray();
               while (i < iterAlpha.length) {
                    int j = 0;
                    while (j < iterNum) {
                         bw.write(iterAlpha[i] + "");
                         j++;
                    }
                    i++;
               }
               num--;
               bw.newLine();
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
