import java.io.*;

public class BOJ2231 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          int i = 1;
          if (num >= 100)
               i = num - ft_strlen(num) * 9;
          int flag = 0;
          while (i < num) {
               if (summingNum(i) == num) {
                    flag = 1;
                    break;
               }
               i++;
          }
          if (flag == 0)
               bw.write(0 + "\n");
          else
               bw.write(i + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     public static int ft_strlen(int num) {
          int i = 0;
          while (num > 0) {
               i++;
               num /= 10;
          }
          return (i);
     }

     public static int summingNum(int num) {
          int res = num;

          while (num > 0) {
               res += num % 10;
               num /= 10;
          }
          return (res);
     }
}
