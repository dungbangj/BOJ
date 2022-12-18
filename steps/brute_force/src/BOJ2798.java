import java.io.*;
import java.util.StringTokenizer;

public class BOJ2798 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st;
          st = new StringTokenizer(br.readLine());
          int num = Integer.parseInt(st.nextToken());
          int dest = Integer.parseInt(st.nextToken());
          int result = 0;
          st = new StringTokenizer(br.readLine());
          int[] arr = new int[num];
          int i = 0;
          while (i < num)
               arr[i++] = Integer.parseInt(st.nextToken());
          i = 0;
          int j, k;
          while (i < num - 2) {
               j = i + 1;
               while (j < num - 1) {
                    k = j + 1;
                    while (k < num) {
                         int three = arr[i] + arr[j] + arr[k];
                         if (dest == three)
                              result = three;
                         if (result < three && three < dest)
                              result = three;
                         k++;
                    }
                    j++;
               }
               i++;
          }
          bw.write(result + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}

