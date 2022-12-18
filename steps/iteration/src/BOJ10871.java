import java.io.*;
import java.util.StringTokenizer;

public class BOJ10871 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int num = Integer.parseInt(st.nextToken());
          int max = Integer.parseInt(st.nextToken());
          int[] arr = new int[10000];
          int i = 0;
          int tmp;
          st = new StringTokenizer(br.readLine());
          while (num > 0) {
               tmp = Integer.parseInt(st.nextToken());
               if (tmp < max)
                    arr[i++] = tmp;
               num--;
          }
          i = 0;
          while (arr[i] > 0)
               bw.write(arr[i++] + " ");
          br.close();
          bw.flush();
          bw.close();
     }
}
