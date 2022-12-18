import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10814 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          String[][] arr = new String[num][2];
          for (int i = 0; i < num; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               arr[i][0] = st.nextToken();
               arr[i][1] = st.nextToken();
          }

          Arrays.sort(arr, new Comparator<String[]>() {
               @Override
               public int compare(String[] o1, String[] o2) {
                    return (makingInt(o1[0]) - makingInt(o2[0]));
               }
          });

          for (int i = 0; i < num; i++)
               bw.write(arr[i][0] + " " + arr[i][1] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }

     static int makingInt(String num) {
          char[] arr = num.toCharArray();
          int i = 0;
          int res = 0;
          while (i < arr.length) {
               res = res * 10 + (arr[i++] - '0');
          }
          return (res);
     }
}
