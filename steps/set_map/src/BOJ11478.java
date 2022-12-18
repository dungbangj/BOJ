import java.io.*;
import java.util.HashSet;

public class BOJ11478 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          String str = br.readLine();
          HashSet<String> set = new HashSet<>();

          for (int i = 0; i < str.length(); i++) {
               String name = "";
               for (int j = i; j < str.length(); j++) {
                    name += str.substring(j, j + 1);
                    set.add(name);
               }
          }
          bw.write(set.size() + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
