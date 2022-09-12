import java.io.*;

public class BOJ25501 {
     static BufferedWriter bw;
     static BufferedReader br;
     static int flag;

     public static void main(String[] args) throws IOException {
          br = new BufferedReader(new InputStreamReader(System.in));
          bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          for (int i = 0; i < num; i++) {
               char[] ch = br.readLine().toCharArray();
               flag = 0;
               int count = howManyRecur(0, ch.length - 1, ch) + 1;
               bw.write(flag + " " + count + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
     }

     static int howManyRecur(int l, int r, char[] ch) {
          if (r <= l) {
               flag = 1;
               return 0;
          }

          if (ch[r] == ch[l])
               return 1 + howManyRecur(++l, --r, ch);
          return 0;
     }
}
