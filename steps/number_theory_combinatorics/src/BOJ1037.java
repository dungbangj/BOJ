import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1037 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int[] arr = new int[num];
          StringTokenizer st = new StringTokenizer(br.readLine());
          for (int i = 0; i < num; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
          }
          Arrays.sort(arr);
          if (num == 1)
               bw.write(arr[0] * arr[0] + "\n");
          else
               bw.write(arr[0] * arr[num - 1] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
