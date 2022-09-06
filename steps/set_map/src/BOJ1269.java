import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ1269 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int hear = Integer.parseInt(st.nextToken());
          int see = Integer.parseInt(st.nextToken());

          HashSet<Integer> hearSet = new HashSet<>();
          HashSet<Integer> seeSet = new HashSet<>();
          st = new StringTokenizer(br.readLine());
          for (int i = 0; i < hear; i++) {
               hearSet.add(Integer.parseInt(st.nextToken()));
          }
          st = new StringTokenizer(br.readLine());
          for (int i = 0; i < see; i++) {
               seeSet.add(Integer.valueOf(st.nextToken()));
          }
          HashSet<Integer> hearSet2 = new HashSet<>(hearSet);
          HashSet<Integer> seeSet2 = new HashSet<>(seeSet);
          hearSet.removeAll(seeSet);
          seeSet2.removeAll(hearSet2);
          bw.write(hearSet.size() + seeSet2.size() + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
