import java.io.*;
import java.util.StringTokenizer;

public class BOJ3036 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          StringTokenizer st = new StringTokenizer(br.readLine());
          int[] arr = new int[num];
          for (int i = 0; i < num; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
          }
          for (int i = 1; i < num; i++) {
               int gcd = gcd(arr[0], arr[i]);
               bw.write(arr[0] / gcd + "/" + arr[i] / gcd +"\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int gcd(int big, int small) {
          if (small == 0) return big;
          return gcd(small, big % small);
     }
}
