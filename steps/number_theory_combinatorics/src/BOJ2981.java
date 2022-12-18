import java.io.*;
import java.util.*;

public class BOJ2981 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          Integer[] arr = new Integer[num];
          for (int i = 0; i < num; i++) {
               arr[i] = Integer.parseInt(br.readLine());
          }
          Arrays.sort(arr, Collections.reverseOrder());
          int gcd = arr[0] - arr[1];
          for (int i = 2; i < arr.length; i++) {
               gcd = gcd(gcd, arr[i - 1] - arr[i]);
          }
          for (int i = 2; i <= gcd; i++) {
               if (gcd % i == 0)
                    bw.write(i + " ");
          }

          br.close();
          bw.flush();
          bw.close();
     }

     static int gcd(int a, int b) {
          int big = Math.max(a, b);
          int small = Math.min(a, b);
          if (small == 0) return big;
          return gcd(small, big % small);
     }

}
