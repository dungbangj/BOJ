import java.io.*;

public class BOJ1065 {
     public static boolean checkingnum(int num) {
          int a, b, c;
          a = num % 10;
          num /= 10;
          b = num % 10;
          num /= 10;
          c = num % 10;

          if ((a - b == b - c) || (c - b == b - a))
               return (true);
          return (false);
     }

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int i = 1, count = 0;
          while (i <= num) {
               if (i < 100)
                    count++;
               else if (i >= 100 && checkingnum(i))
                    count++;
               i++;
          }
          if (num == 1000)
               count--;
          bw.write(count + "\n");
          bw.flush();
          bw.close();
     }
}
