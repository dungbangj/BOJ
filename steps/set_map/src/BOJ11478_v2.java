import java.io.*;
import java.util.Arrays;

public class BOJ11478_v2 {

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          String input = br.readLine();
          int length = input.length();
          String[] arr = new String[length];
          int lcp = 0;
          for (int i = 0; i < length; i++) {
               arr[i] = input.substring(length - 1 - i);
          }
          Arrays.sort(arr);
          System.out.println(Arrays.toString(arr));
          for (int i = 1; i < length; i++) {
               for (int j = 0; j < arr[i - 1].length(); j++) {
                    if(arr[i-1].charAt(j) == arr[i].charAt(j)) {
                         lcp++;
                    }
                    else {
                         break;
                    }
               }
          }
          int ans = (length*(length+1)/2-lcp);
          bw.write(String.valueOf(ans));
          bw.flush();
          bw.close();
          br.close();
     }
}
