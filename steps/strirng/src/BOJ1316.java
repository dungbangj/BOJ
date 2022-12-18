import java.io.*;
import java.util.Arrays;

public class BOJ1316 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int[] tmp;
          int count = 0;
          char[] obj;
          char tmpAlpha;
          int i, j;

          while (0 < num) {
               i = 1;
               j = 0;
               tmp = new int[26];
               obj = br.readLine().toCharArray();
               tmpAlpha = obj[0];
               while (i < obj.length) {
                    if (tmpAlpha == obj[i]) {
                         i++;
                         continue;
                    }
                    tmp[tmpAlpha - 97]++;
                    tmpAlpha = obj[i++];
               }
               tmp[tmpAlpha - 97]++;
               i = 0;
               while (i < tmp.length) {
                    if (tmp[i] > 1)
                         break;
                    if (i == tmp.length - 1)
                         count++;
                    i++;
               }
               num--;
          }
          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
