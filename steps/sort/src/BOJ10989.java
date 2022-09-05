import java.io.*;

public class BOJ10989 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          int[] arr = new int[10001];
          int max = -1;
          for (int i = 0; i < N; i++) {
               int num = Integer.parseInt(br.readLine());
               arr[num]++;
               if (num > max)
                    max = num;
          }
          for (int i = 1; i <= max; i++)
               for (int j = 1; j <= arr[i]; j++)
                    bw.write(i + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
