import java.io.*;
import java.util.StringTokenizer;

public class BOJ5086 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          while (true) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int a = Integer.parseInt(st.nextToken());
               int b = Integer.parseInt(st.nextToken());
               if(a == b && a == 0) break;
               if (b / a > 0 && b % a == 0) bw.write("factor\n");
               else if (a / b > 0 && a % b == 0) bw.write("multiple\n");
               else bw.write("neither\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
