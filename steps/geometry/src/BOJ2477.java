import java.io.*;
import java.util.StringTokenizer;

public class BOJ2477 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int[][] arr = new int[6][2];
          for (int i = 0; i < 6; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               arr[i][0] = Integer.parseInt(st.nextToken());
               arr[i][1] = Integer.parseInt(st.nextToken());
          }
          int mul = 1;
          int maxX = 0;
          int maxY = 0;
          for (int i = 0; i < 6; i++) {
               if (arr[i][0] == 1 || arr[i][0] == 2) {
                    if (arr[i][1] > maxX)
                         maxX = arr[i][1];
               } else if (arr[i][0] == 3 || arr[i][0] == 4) {
                    if (arr[i][1] > maxY)
                         maxY = arr[i][1];
               }
               int n = (i + 1) % 6;
               int nn = (i + 2) % 6;
               if (arr[i][0] == arr[nn][0])
                    mul *= arr[n][1];

          }
          bw.write((maxX * maxY - mul) * num + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
