import java.io.*;

public class BOJ1157 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          char[] arr = br.readLine().toCharArray();
          int[] alphabet = new int[26];
          int i = 0, max = -1, maxIndex = 0, count = 0;

          while (i < arr.length) {
               if (arr[i] >= 97)
                    arr[i] -= 32;
               alphabet[arr[i++] - 65]++;
          }
          i =0;
          while (i < alphabet.length) {
               if (alphabet[i] > max) {
                    maxIndex = i;
                    max = alphabet[i];
               }
               i++;
          }
          i = 0;
          while (i < alphabet.length) {
               if (alphabet[i] == max)
                    count++;
               i++;
          }
          if (count > 1)
               bw.write("?\n");
          else
               bw.write((char)(maxIndex + 65) + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
