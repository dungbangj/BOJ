import java.io.*;
import java.util.Arrays;

public class BOJ2108 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int[] arr = new int[num];
          int[] tmpArr = new int[num];
          int[] arr2 = new int[num];
          int i = 0;
          double sum = 0;

          while (i < num) {
               arr[i] = Integer.parseInt(br.readLine());
               sum += arr[i++];
          }
          double avg = sum / num;
          double tmpAvg = avg;
          if (avg < 0)
               tmpAvg *= -1;
          if (tmpAvg - (int) tmpAvg >= 0.5) {

               if (avg < 0)
                    bw.write((int) avg - 1 + "\n");
               else
                    bw.write((int) avg + 1 + "\n");
          } else
               bw.write((int) avg + "\n");
          MergeSortUtil(arr, tmpArr, 0, num - 1);
          int count = 1;
          int tmp = arr[0];
          arr2[0] = count;
          int max = -4001;
          for (int j = 1; j < arr.length; j++) {
               if (tmp == arr[j]) {
                    count++;
               } else {
                    tmp = arr[j];
                    count = 1;
               }
               arr2[j] = count;
               if (max < arr2[j])
                    max = arr2[j];
          }
//          System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(arr2) + "\n" + max);
          int flag = 0, idx = 0;
          for (int j = 0; j < arr2.length; j++) {
               if (arr2[j] == max && flag == 0) {
                    flag = 1;
                    idx = j;
                    continue;
               }
               if (arr2[j] == max && flag == 1) {
                    idx = j;
                    break;
               }
          }
          bw.write(arr[num / 2] + "\n");
          bw.write(arr[idx] + "\n");
          bw.write(arr[num - 1] - arr[0] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static void MergeSortUtil(int[] arr, int[] tmpArr, int l, int r) {
          if (r <= l) return;
          int mid = (r + l) / 2;

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
