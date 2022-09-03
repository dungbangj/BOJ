import java.io.*;

public class BOJ10872 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int res = 1;
          while (num > 0)
               res *= num--;
          bw.write(res + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
