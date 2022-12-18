import java.io.*;

public class BOJ2447 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int i = 0;
          int j;
          int blank = num / 3;
          char[][] arr = new char[num][num];
          while (i < num) {
               j = 0;
               while (j < num)
                    arr[i][j++] = '*';
               i++;
          }

          i = 0;
          int k = 3;
          while (k <= num) {
               int countThree = 0;
               i = 0;
               while (i < num) {
                    j = 0;
                    while (j < num) {
                         if ((i % k == k / 3) && (j % k == k / 3)) {
                              countThree = k / 3;
                              int tmpi = i, tmpj;
                              while (tmpi < countThree + i) {
                                   tmpj = j;
                                   while (tmpj < countThree + j) {
                                        arr[tmpi][tmpj] = ' ';
                                        tmpj++;
                                   }
                                   tmpi++;
                              }
                         }
                         j++;
                    }
                    i++;
               }
               k *= 3;
          }

          i = 0;
          while (i < num) {
               j = 0;
               while (j < num) {
                    bw.write(arr[i][j] + "");
                    j++;
               }
               i++;
               bw.newLine();
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
