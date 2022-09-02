import java.io.*;

public class BOJ10809 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          String str = br.readLine();
          char[] arr = str.toCharArray();
          int[] alphabet = new int[26];
          int i = 0;
          while (i < alphabet.length) alphabet[i++] = -1;
          i = 0;
          while (i < arr.length) {
               if (alphabet[arr[i] - 97] == -1)
                    alphabet[arr[i] - 97] = i;
               i++;
          }
          i = 0;
          while (i < alphabet.length) bw.write(alphabet[i++] + " ");
          bw.newLine();
          br.close();
          bw.flush();
          bw.close();
     }
}
