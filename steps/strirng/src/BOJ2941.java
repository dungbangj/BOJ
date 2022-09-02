import java.io.*;

public class BOJ2941 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          char[] str = br.readLine().toCharArray();
          char[] arr = new char[110];
          int i = 0, count = 0;
          while (i < str.length) {
               arr[i] = str[i];
               i++;
          }
          i = 0;
          while (i < str.length) {
               if (arr[i] == 'c' && (arr[i + 1] == '=' || arr[i + 1] == '-'))
                    i += 1;
               else if (arr[i] == 'd') {
                    if (arr[i + 1] == 'z' && arr[i + 2] == '=')
                         i += 2;
                    else if (arr[i + 1] == '-')
                         i += 1;
               }
               else if ((arr[i] == 'n' || arr[i] == 'l') && arr[i + 1] == 'j')
                    i += 1;
               else if ((arr[i] == 's' || arr[i] == 'z') && arr[i + 1] == '=')
                    i += 1;
               i++;
               count++;
          }
          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
