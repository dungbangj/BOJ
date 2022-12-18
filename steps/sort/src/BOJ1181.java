import java.io.*;
import java.util.Objects;

public class BOJ1181 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          String[] arr = new String[num];
          int count = 1;
          arr[0] = br.readLine();
          int tmpNum = num;
          for (int i = 1; i < num; i++) {
               arr[i] = br.readLine();
               for (int tmpi = 0; tmpi < i; tmpi++) {
                    if (Objects.equals(arr[tmpi], arr[i])) {
                         i--;
                         tmpNum--;
                         break;
                    }
               }
               count++;
               if (count == num)
                    break;
          }
          String[] tmpArr = new String[num];
          MergeSortSortUtil(arr, tmpArr, 0, tmpNum - 1);
          int i = 0;
          while (i < num) {
               if (Objects.equals(arr[i], null))
                    break;
               bw.write(arr[i++] + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static void Merge(String[] arr, String[] tmpArr, int l, int mid, int r) {
          int lstart = l;
          int lstop = mid;
          int rstart = mid + 1;
          int rstop = r;
          int tmpArrIdx = l;
          while (lstart <= lstop && rstart <= rstop) {
               if (arr[lstart].length() == arr[rstart].length()) {
                    int i = 0;
                    while (i < arr[lstart].length()) {
                         if (arr[lstart].charAt(i) != arr[rstart].charAt(i))
                              break;
                         i++;
                    }
                    if (arr[lstart].charAt(i) < arr[rstart].charAt(i)) {
                         tmpArr[tmpArrIdx++] = arr[lstart++];
                    } else if (arr[lstart].charAt(i) > arr[rstart].charAt(i)) {
                         tmpArr[tmpArrIdx++] = arr[rstart++];
                    }
               } else if (arr[lstart].length() < arr[rstart].length()) {
                    tmpArr[tmpArrIdx++] = arr[lstart++];
               } else {
                    tmpArr[tmpArrIdx++] = arr[rstart++];
               }
          }
          while (lstart <= lstop)
               tmpArr[tmpArrIdx++] = arr[lstart++];
          while (rstart <= rstop)
               tmpArr[tmpArrIdx++] = arr[rstart++];
          for (int i = l; i <= r; i++)
               arr[i] = tmpArr[i];
     }

     static void MergeSortSortUtil(String[] arr, String[] tmpArr, int l, int r) {
          if (l >= r) return;
          int mid = (l + r) / 2;

          MergeSortSortUtil(arr, tmpArr, l, mid);
          MergeSortSortUtil(arr, tmpArr, mid + 1, r);
          Merge(arr, tmpArr, l, mid, r);
     }
}
