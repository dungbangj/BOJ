import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ9375 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          for (int i = 0; i < num; i++) {
               int num2 = Integer.parseInt(br.readLine());
               HashMap<String, Integer> map = new HashMap<>();
               for (int j = 0; j < num2; j++) {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    st.nextToken();
                    String kind = st.nextToken();
                    if (map.containsKey(kind)) {
                         map.put(kind, map.get(kind) + 1);
                    } else {
                         map.put(kind, 1);
                    }
               }
               int mul = 1;
               for (int val : map.values()) {
                    mul *= (val + 1);
               }
               bw.write(mul - 1 + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
