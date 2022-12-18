import java.io.*;
import java.util.*;

public class BOJ1764 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int hear = Integer.parseInt(st.nextToken());
          int see = Integer.parseInt(st.nextToken());

          HashSet<String> hearSet = new HashSet<>();
          HashSet<String> seeSet = new HashSet<>();
          for (int i = 0; i < hear; i++) {
               hearSet.add(br.readLine());
          }
          for (int i = 0; i < see; i++) {
               seeSet.add(br.readLine());
          }
          hearSet.retainAll(seeSet);
          Object[] arr = hearSet.toArray();
          String[] arr2 = new String[arr.length];
          for (int i = 0; i < arr2.length; i++) {
               arr2[i] = (String) arr[i];
          }
          Arrays.sort(arr2, new Comparator<String>() {
               @Override
               public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
               }
          });
          bw.write(arr.length + "\n");
          for (int i = 0; i < arr2.length; i++)
               bw.write(arr2[i] + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
