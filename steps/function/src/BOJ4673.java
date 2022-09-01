import java.io.*;

public class BOJ4673 {
     static int notSelfNumber(int a) {
          int sum = a;

          while (a != 0){
               sum = sum + (a % 10);
               a = a / 10;
          }
          return sum;
     }

     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          boolean[] arr = new boolean[10001];
          int num = 1;
          int res, i = 1;
          while (num <= 10000) {
               res = notSelfNumber(num);
               if (res <= 10000)
                    arr[res] = true;
//               if (res > 10000)
//                    break;
//               arr[res] = true;
               num++;
          }
          while (i <= 10000) {
               if (!arr[i])
                    bw.write(i + "\n");
               i++;
          }
          bw.flush();
          bw.close();
     }
}
