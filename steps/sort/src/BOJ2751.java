import java.io.*;

public class BOJ2751 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int[] arr = new int[num];
          int[] tmpArr = new int[num];
          int i = 0;
          while (i < num)
               arr[i++] = Integer.parseInt(br.readLine());
          MergeSortSortUtil(arr, tmpArr, 0, num - 1);
          i = 0;
          while (i < num)
               bw.write(arr[i++] + "\n");
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
