import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BOJ1546 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int[] arr = new int[num];
          StringTokenizer st = new StringTokenizer(br.readLine());
          int tmpNum = num;
          int i = 0;
          double sum = 0;
          int max = -1;
          while (i < num) {
               arr[i] = Integer.parseInt(st.nextToken());
               if (max < arr[i])
                    max = arr[i];
               i++;
          }
          i = 0;
          while (i < num)
               sum += (((double)arr[i++] / max) * 100);
          bw.write(sum / tmpNum + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
