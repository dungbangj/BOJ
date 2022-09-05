import java.io.*;

public class BOJ2750 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int[] arr = new int[num];
          int i = 0;
          while (i < num)
               arr[i++] = Integer.parseInt(br.readLine());
          QuickSort(arr, 0, num - 1);
          i = 0;
          while (i < num)
               bw.write(arr[i++] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static void swap(int[] arr, int i, int j) {
          int t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
     }

     static void QuickSort(int[] arr, int l, int r) {
          int pl = l;
          int pr = r;
          int x = arr[(pl + pr) / 2];
          do {
               while (arr[pl] < x) pl++;
               while (arr[pr] > x) pr--;
               if (pl <= pr) swap(arr, pl++, pr--);
          } while (pl <= pr);
          if (l < pr) QuickSort(arr, l, pr);
          if (pl < r) QuickSort(arr, pl, r);
     }
}
