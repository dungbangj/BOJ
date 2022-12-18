import java.io.*;
import java.util.StringTokenizer;

public class BOJ9020 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          boolean[] priArr = new boolean[20000];
          priArr[0] = true;
          priArr[1] = true;
          int i = 2;
          int count = 0;
          while (i < priArr.length) {
               int j = 2;
               while (i * j < priArr.length)
                    priArr[i * j++] = true;
               i++;
          }

          i = 0;
          int j = 0;
          while (i < priArr.length) {
               if (!priArr[i])
                    count++;
               i++;
          }

          int[] arr = new int[count];
          i = 0;
          while (i < priArr.length) {
               if (!priArr[i])
                    arr[j++] = i;
               i++;
          }

          while (num > 0) {
               int newNum = Integer.parseInt(br.readLine());
               i = 0;
               while (i < arr.length) {
                    if (arr[i] > newNum)
                         break;
                    i++;
               }
               int l = 0;
               int r = i;
               while (true) {
                    int mid = (l + r) / 2;
                    if (arr[l] + arr[r] == newNum && r <= l)
                         break;
                    else if (arr[l] + arr[r] == newNum) {
                         l++;
                         r--;
                    } else if (arr[l] + arr[r] > newNum)
                         r--;
                    else if (arr[l] + arr[r] < newNum)
                         l++;
               }
               bw.write(arr[r] + " " + arr[l] + "\n");
               num--;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
