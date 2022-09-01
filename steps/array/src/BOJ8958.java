import java.io.*;

public class BOJ8958 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int i;
          int count, countSum;
          while (num > 0) {
               String arr = br.readLine();
               char[] charArr = arr.toCharArray();
               i = 0;
               count = 0;
               countSum = 0;
               while (i < charArr.length) {
                    if (charArr[i] == 'O') {
                         count++;
                         countSum += count;
                    } else if (charArr[i] == 'X')
                         count = 0;
                    i++;
               }
               bw.write(countSum + "\n");
               num--;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
