import java.io.*;
import java.nio.Buffer;

public class BOJ3052 {
     static void swap(int[] a, int idx1, int idx2) {
          int t = a[idx1];
          a[idx1] = a[idx2];
          a[idx2] = t;
     }

     static void quicksort(int[] a, int l, int r) {
          int pl = l;
          int pr = r;
          int mid = a[(pl + pr) / 2];
          do {
               while (a[pl] < mid) pl++;
               while (a[pr] > mid) pr--;
               if (pl <= pr) swap(a, pl++, pr--);
          } while (pl <= pr);
          if (l < pr) quicksort(a, l, pr);
          if (pl < r) quicksort(a, pl, r);
     }

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int[] arr = new int[10];
          int i = 0;
          int num, count, maxCount = 0;
          while (i < 10)
               arr[i++] = Integer.parseInt(br.readLine()) % 42;
          quicksort(arr, 0, 9);
          i = 0;
          num = -1;
          count = 0;
          while (i < 10) {
               if (num != arr[i]) {
                    count++;
                    num = arr[i];
               }
               i++;
          }
          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
