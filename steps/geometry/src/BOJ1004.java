import java.io.*;
import java.util.StringTokenizer;

public class BOJ1004 {

     private static int a1;
     private static int b1;
     private static int a2;
     private static int b2;

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int T = Integer.parseInt(br.readLine());
          for (int i = 0; i < T; i++) {
               int count = 0;
               StringTokenizer st = new StringTokenizer(br.readLine());
               a1 = Integer.parseInt(st.nextToken());
               b1 = Integer.parseInt(st.nextToken());
               a2 = Integer.parseInt(st.nextToken());
               b2 = Integer.parseInt(st.nextToken());
               int num = Integer.parseInt(br.readLine());
               int[][] arr = new int[num][3];
               for (int j = 0; j < num; j++) {
                    st = new StringTokenizer(br.readLine());
                    arr[j][0] = Integer.parseInt(st.nextToken());
                    arr[j][1] = Integer.parseInt(st.nextToken());
                    arr[j][2] = Integer.parseInt(st.nextToken());
               }
               count += checkingDistance(a1, b1, a2, b2, arr);
               bw.write(count + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int checkingDistance(int a1, int b1, int a2, int b2, int[][] arr) {
          int count = 0;
          for (int i = 0; i < arr.length; i++) {
               if (MySqr(a1 - arr[i][0], b1 - arr[i][1]) < arr[i][2]) {
                    count++;
               }
               if (MySqr(a2 - arr[i][0], b2 - arr[i][1]) < arr[i][2]) {
                    count++;
               }
               if (MySqr(a1 - arr[i][0], b1 - arr[i][1]) < arr[i][2] && MySqr(a2 - arr[i][0], b2 - arr[i][1]) < arr[i][2]) {
                    count -= 2;
               }
          }
          return count;
     }

     static int MySqr(int a, int b) {
          return (int)Math.pow(a * a + b * b, 0.5);
     }
}
