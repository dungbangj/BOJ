import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num1 = Integer.parseInt(br.readLine());
          StringTokenizer st;
          st = new StringTokenizer(br.readLine());
          int[] arr1 = new int[num1];
          for (int i = 0; i < num1; i++)
               arr1[i] = Integer.parseInt(st.nextToken());
          Arrays.sort(arr1);
          int num2 = Integer.parseInt(br.readLine());
          int[] arr2 = new int[num2];
          st = new StringTokenizer(br.readLine());
          for (int i = 0; i < num2; i++) {
               arr2[i] = Integer.parseInt(st.nextToken());
               if(binarySearch(arr1, 0, num1 - 1, arr2[i]))
                    bw.write(1 + " ");
               else
                    bw.write(0 + " ");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static boolean binarySearch(int[] arr, int l, int r, int key) {
          int mid = -1, flag = 0;
          while (l <= r) {
               mid = (l + r) / 2;
               if (key < arr[mid]) r = mid - 1;
               else if (key > arr[mid]) {
                    l = mid + 1;
               } else {
                    flag = 1;
                    break;
               }
          }
          return flag == 1;
     }
}
