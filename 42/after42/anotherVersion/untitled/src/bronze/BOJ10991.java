package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10991 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          int L = -1;
          for (int i = 0; i < N - 1; i++) {
               for (int j = 0; j < N - i - 1; j++) {
                    System.out.print(' ');
               }
               System.out.print('*');
               for (int j = 0; j < L; j++) {
                    System.out.print(' ');
               }
               L += 2;
               if (i != 0)
                    System.out.print('*');
               System.out.println();
          }
          for (int i = 0; i < N * 2 - 1; i++) {
               System.out.print('*');
          }
     }
}
