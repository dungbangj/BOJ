import java.io.*;

public class BOJ1152 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          char[] arr = br.readLine().toCharArray();
          int count = 0;
          int i = 1;
          if (arr[0] != ' ')
               count++;
          while (i < arr.length) {
               if (arr[i] != ' ' && arr[i - 1] == ' ')
                    count++;
               i++;
          }
          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
