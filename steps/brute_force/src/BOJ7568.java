import java.io.*;
import java.util.StringTokenizer;

public class BOJ7568 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int[][] arr = new int[num][2];
          int i = 0;
          StringTokenizer st;
          while (i < num) {
               st = new StringTokenizer(br.readLine());
               arr[i][0] = Integer.parseInt(st.nextToken());
               arr[i][1] = Integer.parseInt(st.nextToken());
               i++;
          }
          i = 0;
          int j, rank;
          while (i < num) {
               j = 0;
               rank = 1;
               while (j < num) {
                    if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                         rank++;
                    j++;
               }
               bw.write(rank + " ");
               i++;
          }
          bw.newLine();
          br.close();
          bw.flush();
          bw.close();
     }
}
