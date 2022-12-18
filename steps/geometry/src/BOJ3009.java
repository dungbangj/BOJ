import java.io.*;
import java.util.StringTokenizer;

public class BOJ3009 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int[] arrX = new int[4];
          int[] arrY = new int[4];
          for (int i = 0; i < 3; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               arrX[i] = Integer.parseInt(st.nextToken());
               arrY[i] = Integer.parseInt(st.nextToken());
          }
          makingZero(arrX);
          makingZero(arrY);
          bw.write(returningNotZero(arrX) + " " + returningNotZero(arrY));
          br.close();
          bw.flush();
          bw.close();
     }

     static void makingZero(int[] arr) {
          if (arr[0] == arr[1]) {
               arr[0] = 0;
               arr[1] = 0;
          } else if (arr[0] == arr[2]) {
               arr[0] = 0;
               arr[2] = 0;
          } else {
               arr[1] = 0;
               arr[2] = 0;
          }
     }

     static int returningNotZero(int[] arr) {
          for (int i = 0; i < 3; i++) {
               if (arr[i] != 0)
                    return arr[i];
          }
          return 0;
     }
}
