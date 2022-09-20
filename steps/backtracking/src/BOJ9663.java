import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9663 {

     static int[] arr;
     static int count = 0;
     static int N;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          N = Integer.parseInt(br.readLine());
          arr = new int[N];
          nqueen(0);
          System.out.println(count);
     }

     static void nqueen(int col) {

          if (N == col) {
               count++;
               return;
          }

          for (int i = 0; i < N; i++) {
               arr[col] = i;
               if (untouchable(col)) {
                    nqueen(col + 1);
               }
          }
     }

     static boolean untouchable(int col) {

          for (int i = 0; i < col; i++) {
               if (arr[col] == arr[i] || Math.abs(arr[col] - arr[i]) == Math.abs(col - i))
                    return false;
          }
          return true;
     }
}
