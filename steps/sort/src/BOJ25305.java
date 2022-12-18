import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ25305 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int total = Integer.parseInt(st.nextToken());
          int awawrded = Integer.parseInt(st.nextToken());
          int[] arr = new int[total];
          int[] tmpArr = new int[total];
          st = new StringTokenizer(br.readLine());
          for (int i = 0; i < total; i++)
               arr[i] = Integer.parseInt(st.nextToken());
          MergeSortSortUtil(arr, tmpArr, 0, total - 1);
          bw.write(arr[total - awawrded] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static void Merge(int[] arr, int[] tmpArr, int l, int mid, int r) {
          int lstart = l;
          int lstop = mid;
          int rstart = mid + 1;
          int rstop = r;
          int tmpArrIdx = l;
          while (lstart <= lstop && rstart <= rstop) {
               if (arr[lstart] < arr[rstart])
                    tmpArr[tmpArrIdx++] = arr[lstart++];
               else
                    tmpArr[tmpArrIdx++] = arr[rstart++];
          }
          while (lstart <= lstop)
               tmpArr[tmpArrIdx++] = arr[lstart++];
          while (rstart <= rstop)
               tmpArr[tmpArrIdx++] = arr[rstart++];
          for (int i = l; i <= r; i++)
               arr[i] = tmpArr[i];
     }

     static void MergeSortSortUtil(int[] arr, int[] tmpArr, int l, int r) {
          if (l >= r) return;
          int mid = (l + r) / 2;

          MergeSortSortUtil(arr, tmpArr, l, mid);
          MergeSortSortUtil(arr, tmpArr,mid + 1, r);
          Merge(arr, tmpArr, l, mid, r);
     }
}