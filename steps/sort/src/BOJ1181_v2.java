import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181_v2 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());

          String[] arr = new String[num];
          for (int i = 0; i < num; i++)
               arr[i] = br.readLine();

          Arrays.sort(arr, new Comparator<String>() {
               @Override
               public int compare(String o1, String o2) {
                    if (o1.length() == o2.length())
                         return o1.compareTo(o2);
                    else
                         return o1.length() - o2.length();
               }
          });

          for (int i = 0; i < num; i++) {
               bw.write(arr[i] + "\n");
               while (i + 1 < num && arr[i].equals(arr[i + 1]))
                    i++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
