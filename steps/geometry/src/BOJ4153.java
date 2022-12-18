import java.io.*;
import java.util.StringTokenizer;

public class BOJ4153 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int[] arr = new int[3];
          while (true) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int max = -1, maxI = 0, sumA = 0, sumB = 0;
               for (int i = 0; i < 3; i++) {
                    arr[i] = Integer.parseInt(st.nextToken());
                    if (arr[i] > max) {
                         maxI = i;
                         max = arr[i];
                    }
               }
               if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == 0)
                    break;
               sumB = MySqr(max);
               arr[maxI] = 0;
               for (int i = 0; i < 3; i++)
                    sumA += MySqr(arr[i]);
               if (sumA == sumB)
                    bw.write("right\n");
               else
                    bw.write("wrong\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int MySqr(int a) {
          return a * a;
     }
}
