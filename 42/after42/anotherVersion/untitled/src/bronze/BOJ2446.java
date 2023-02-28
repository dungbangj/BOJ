package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2446 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          for (int i = 0; i < N; i++) {
               for (int j = 0; j < i; j++) {
                    System.out.print(' ');
               }
               for (int j = i; j < N; j++) {
                    System.out.print('*');
               }
               for (int j = i; j < N - 1; j++) {
                    System.out.print('*');
               }
               System.out.println();
          }
          for (int i = 0; i < N; i++) {
               if (i == 0) continue;
               for (int j = 0; j < N - i - 1; j++) {
                    System.out.print(' ');
               }
               for (int j = 0; j < i + 1; j++) {
                    System.out.print('*');
               }
               for (int j = 0; j < i; j++) {
                    System.out.print('*');
               }
               System.out.println();
          }
     }
}
