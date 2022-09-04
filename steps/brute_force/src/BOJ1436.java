import java.io.*;

public class BOJ1436 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          int i = 1;
          int[] arr = new int[10000];
          int six = 666;
          arr[0] = six++;
          while (i < arr.length) {
               if (checkingThreeSix(six))
                    arr[i++] = six;
               six++;
          }
          bw.write(arr[num - 1] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static boolean checkingThreeSix(int num) {
          int len = ft_strlen(num);
          int[] numChar = new int[len];

          int i = 0;
          int newLen = len - 1;
          while (newLen >= 0) {
               numChar[newLen--] = num % 10;
               num /= 10;
          }
          while (i < len) {
               if (numChar[i] == 6 && i + 2 < len) {
                    i++;
                    if (numChar[i] == 6) {
                         i++;
                         if (numChar[i] == 6)
                              return (true);
                    }
               }
               i++;
          }
          return (false);
     }

     static int ft_strlen(int num) {
          int i = 0;
          while (num > 0) {
               i++;
               num /= 10;
          }
          return (i);
     }
}
