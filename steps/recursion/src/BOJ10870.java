import java.io.*;

public class BOJ10870 {

     static int recur(int num) {
          if (num <= 0)
               return (0);
          if (num == 1)
               return (1);
          return (recur(num - 1) + recur(num - 2));
     }
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          bw.write(recur(num) + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
