import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ24060 {

     static BufferedReader br;
     static BufferedWriter bw;
     static StringTokenizer st;
     static int count;
     static int limit;
     static int answer;

     public static void main(String[] args) throws IOException {
          br = new BufferedReader(new InputStreamReader(System.in));
          bw = new BufferedWriter(new OutputStreamWriter(System.out));
          st = new StringTokenizer(br.readLine());
          int num = Integer.parseInt(st.nextToken());
          limit = Integer.parseInt(st.nextToken());
          int[] arr = new int[num];
          int[] tmpArr = new int[num];
          st = new StringTokenizer(br.readLine());
          count = 0;
          for (int i = 0; i < num; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
          }
          MergeSortUtil(arr, tmpArr, 0, num - 1);
          bw.write(answer + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static void Merge(int[] arr, int[] tmpArr, int l, int mid, int r) {
          int lstart = l;
          int rstart = mid + 1;
          int tmpArrIdx = l;
          while (lstart <= mid && rstart <= r) {
               if (arr[lstart] < arr[rstart]) tmpArr[tmpArrIdx++] = arr[lstart++];
               else tmpArr[tmpArrIdx++] = arr[rstart++];
          }

          while (lstart <= mid) tmpArr[tmpArrIdx++] = arr[lstart++];
          while (rstart <= r) tmpArr[tmpArrIdx++] = arr[rstart++];

          for (int i = l; i <= r; i++) {
               arr[i] = tmpArr[i];
               count++;
               if (count == limit)
                    answer = arr[i];
               else if (count < limit)
                    answer = -1;
          }
     }

     static void MergeSortUtil(int[] arr, int[] tmpArr, int l, int r) {
          if (l >= r) return;
          int mid = (l + r) / 2;

          MergeSortUtil(arr, tmpArr, l, mid);
          MergeSortUtil(arr, tmpArr, mid + 1, r);
          Merge(arr, tmpArr, l, mid, r);
     }
}
