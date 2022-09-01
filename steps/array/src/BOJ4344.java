import java.io.*;
import java.util.StringTokenizer;

public class BOJ4344 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int i, count;
          int[] arr;
          double sum;

          while (num > 0) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               sum = 0;
               i = 0;
               count = 0;
               int col = Integer.parseInt(st.nextToken());
               arr = new int[col];
               while (i < col) {
                    arr[i] = Integer.parseInt(st.nextToken());
                    sum += arr[i++];
               }
               i = 0;
               sum /= col;
               while (i < col) {
                    if (arr[i] > sum)
                         count++;
                    i++;
               }
               bw.write(String.format("%.3f", (double)count / col * 100) + "%\n");
               num--;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
