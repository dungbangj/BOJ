import java.io.*;
import java.util.StringTokenizer;

public class BOJ1018 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int x = Integer.parseInt(st.nextToken());
          int y = Integer.parseInt(st.nextToken());
          char[][] mapArr = new char[x][y];

          int i = 0;

          while (i < x)
               mapArr[i++] = br.readLine().toCharArray();
          i = 0;
          int j = 0, min = 999999;

          while (i + 8 <= x && j + 8 <= y) {
               char first = mapArr[i][j];
               int count = returningCount(mapArr, first, i, j);
               if (count < min)
                    min = count;
               j++;
               if (j + 8 > y) {
                    i++;
                    j = 0;
               }
               if (i + 8 > x)
                    break;
          }
          bw.write(min + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static int returningCount(char[][] mapArr, char first, int i, int j) {
          char[][] destMapArrB = new char[8][8];
          char[][] destMapArrW = new char[8][8];
          int destx = 0, desty, tmpj = j;
          int k = i + 8, h = j + 8, count = 0;

          makingDestMapArr('B', destMapArrB);
          makingDestMapArr('W', destMapArrW);
          while (i < k && destx < 8) {
               j = tmpj;
               desty = 0;

               while (j < h && desty < 8) {
                    if (first == 'B') {
                         if (mapArr[i][j] != destMapArrB[destx][desty])
                              count++;
                    } else if (first == 'W') {
                         if (mapArr[i][j] != destMapArrW[destx][desty])
                              count++;
                    }
                    j++;
                    desty++;
               }
               i++;
               destx++;
          }
          if (64 - count < count)
               count = 64 - count;
          return (count);
     }

     static void makingDestMapArr(char first, char[][] destMapArr) {
          int i = 0, j = 0;
          if (first == 'W') {
               while (i < 8) {
                    destMapArr[i++] = new char[]{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
                    destMapArr[i++] = new char[]{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
               }
          } else {
               while (i < 8) {
                    destMapArr[i++] = new char[]{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
                    destMapArr[i++] = new char[]{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
               }
          }
     }
}
