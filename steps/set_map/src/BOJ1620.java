import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int total = Integer.parseInt(st.nextToken());
          int num = Integer.parseInt(st.nextToken());
          HashMap<Integer, String> map = new HashMap<>();
          HashMap<String, Integer> map2 = new HashMap<>();
          for (int i = 0; i < total; i++) {
               map.put(i + 1, br.readLine());
               map2.put(map.get(i + 1), i + 1);
          }
          for (int i = 0; i < num; i++) {
               String str = br.readLine();
               if ('0' <= str.charAt(0) && str.charAt(0) <= '9') {
                    bw.write(map.get(ft_atoi(str)) + "\n");
               } else {
                    bw.write(map2.get(str) + "\n");
               }
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int ft_atoi(String str) {
          int i = 0, res = 0;
          char[] ch = str.toCharArray();
          while (i < ch.length)
               res = res * 10 + (ch[i++] - '0');
          return res;
     }
}
