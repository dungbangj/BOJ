import java.io.*;
import java.util.StringTokenizer;

public class BOJ11650 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int i = 0;
          StringTokenizer st;
          int[][] arr = new int[num][2];
          int[][] tmpArr = new int[num][2];
          while (i < num) {
               st = new StringTokenizer(br.readLine());
               arr[i][0] = Integer.parseInt(st.nextToken());
               arr[i][1] = Integer.parseInt(st.nextToken());
               i++;
          }
          MergeSortSortUtil(arr, tmpArr, 0, num - 1);
          for (int[] ints : arr) bw.write(ints[0] + " " + ints[1] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static void Merge(int[][] arr, int[][] tmpArr, int l, int mid, int r) {
          int lstart = l;
          int lstop = mid;
          int rstart = mid + 1;
          int rstop = r;
          int tmpArrIdx = l;
          while (lstart <= lstop && rstart <= rstop) {
               if (arr[lstart][0] == arr[rstart][0] && arr[lstart][1] < arr[rstart][1])
                    tmpArr[tmpArrIdx++] = arr[lstart++];
               else if (arr[lstart][0] < arr[rstart][0])
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

     static void MergeSortSortUtil(int[][] arr, int[][] tmpArr, int l, int r) {
          if (l >= r) return;
          int mid = (l + r) / 2;

          MergeSortSortUtil(arr, tmpArr, l, mid);
          MergeSortSortUtil(arr, tmpArr,mid + 1, r);
          Merge(arr, tmpArr, l, mid, r);
     }
}
