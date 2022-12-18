import java.io.*;
import java.util.StringTokenizer;

public class BOJ10816 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          StringTokenizer st = new StringTokenizer(br.readLine());
          int[] arr = new int[20000020];
          for (int i = 0; i < num; i++) {
               arr[Integer.parseInt(st.nextToken()) + 10000001]++;
          }
          int num2 = Integer.parseInt(br.readLine());
          st = new StringTokenizer(br.readLine());
          for (int i = 0; i < num2; i++) {
               bw.write(arr[Integer.parseInt(st.nextToken()) + 10000001] + " ");
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
