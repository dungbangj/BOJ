import java.io.*;

public class BOJ11720 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          String str = br.readLine();
          int sum = 0;
          int i = 0;
          char[] arr = str.toCharArray();

          while (i < num)
               sum += (arr[i++] - '0');
          bw.write(sum + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
