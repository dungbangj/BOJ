import java.io.*;
import java.util.StringTokenizer;

public class BOJ2908 {
     static void swap(char[] arr) {
          char tmp = arr[0];
          arr[0] = arr[2];
          arr[2] = tmp;
     }

     static int makingInt(char[] arr) {
          int i = 0;
          int res = 0;
          while (i < 3)
               res = res * 10 + (arr[i++] - '0');
          return (res);
     }

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          char[] arr1 = st.nextToken().toCharArray();
          char[] arr2 = st.nextToken().toCharArray();
          swap(arr1);
          swap(arr2);
          int a = makingInt(arr1);
          int b = makingInt(arr2);

          bw.write(((a > b) ? a : b) + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
