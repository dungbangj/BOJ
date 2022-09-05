import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ18870 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          StringTokenizer st = new StringTokenizer(br.readLine());
          int[] arr = new int[num];
          int[] arrCopy = new int[num];
          int[] rankArr = new int[num];
          for (int i = 0; i < num; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
               arrCopy[i] = arr[i];
          }
          Arrays.sort(arr);
          rankArr[0] = arr[0];
          int k = 1, j = 1;
          while (k < num){
               if (arr[j - 1] != arr[j])
                    rankArr[k++] = arr[j];
               j++;
               if (j == num)
                    break;
          }
          for (int i = 0; i < num; i++) {
               arr[i] = binarySearch(rankArr, 0, k - 1, arrCopy[i]);
          }
          for (int i = 0; i < num; i++) {
               bw.write(arr[i] + " ");
          }
          bw.newLine();
          br.close();
          bw.flush();
          bw.close();
     }

     static int binarySearch(int[] arr, int l, int r, int key) {
          int mid = 0;
          while (l <= r) {
               mid = (l + r) / 2;
               if (key < arr[mid]) r = mid - 1;
               else if (arr[mid] < key) l = mid + 1;
               else break;
          }
          return (mid);
     }
}
