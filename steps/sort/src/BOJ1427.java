import java.io.*;

public class BOJ1427 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int len = ft_numLen(num);
          int[] arr = new int[len];
          int[] tmpArr = new int[len];
          for (int i = 0; i < len; i++) {
               arr[i] = num % 10;
               num /= 10;
          }
          MergeSortUtil(arr, tmpArr, 0, len - 1);
          for (int i = len - 1; i >= 0; i--)
               bw.write(arr[i] + "");
          br.close();
          bw.flush();
          bw.close();
     }

     static int ft_numLen(int num) {
          int i = 0;
          while (num > 0) {
               i++;
               num /= 10;
          }
          return (i);
     }

     static void MergeSortUtil(int[] arr, int[] tmpArr, int l, int r) {
          if (r <= l) return;
          int mid = (l + r) / 2;
          MergeSortUtil(arr, tmpArr, l, mid);
          MergeSortUtil(arr, tmpArr, mid + 1, r);
          Merge(arr, tmpArr, l, mid, r);
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
          while (lstart <= lstop) tmpArr[tmpArrIdx++] = arr[lstart++];
          while (rstart <= rstop) tmpArr[tmpArrIdx++] = arr[rstart++];
          for (int i = l; i <= r; i++)
               arr[i] = tmpArr[i];
     }
}
