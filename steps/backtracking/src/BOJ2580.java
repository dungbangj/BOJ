import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2580 {

     static int[][] arr = new int[9][9];
     static StringBuilder sb = new StringBuilder();
     static StringTokenizer st;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          for (int i = 0; i < 9; i++) {
               st = new StringTokenizer(br.readLine());
               for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
               }
          }
          sudoku(0, 0);
     }

     static void sudoku(int row, int col) {

          if (col == 9) {
               sudoku(row + 1, 0);
               return;
          }

          if (row == 9) {
               for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                         sb.append(arr[i][j]).append(' ');
                    }
                    sb.append('\n');
               }
               System.out.println(sb);
               System.exit(0);
          }

          if (arr[row][col] == 0) {
               for (int i = 1; i <= 9; i++) {
                    if (possible(row, col, i)) {
                         arr[row][col] = i;
                         sudoku(row, col + 1);
                    }
               }
               arr[row][col] = 0;
               return;
          }
          sudoku(row, col + 1);
     }

     static boolean possible(int row, int col, int num) {
          for (int i = 0; i < 9; i++) {
               if (arr[row][i] == num) {
                    return false;
               }
          }

          for (int i = 0; i < 9; i++) {
               if (arr[i][col] == num) {
                    return false;
               }
          }

          int check3Row = (row / 3) * 3;
          int check3Col = (col / 3) * 3;

          for (int i = check3Row; i < check3Row + 3; i++) {
               for (int j = check3Col; j < check3Col + 3; j++) {
                    if (arr[i][j] == num) {
                         return false;
                    }
               }
          }
          return true;
     }
}
