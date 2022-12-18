import java.io.*;

public class BOJ5622 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          char[] arr = br.readLine().toCharArray();
          int i = 0;
          int time = 0;
          while (i < arr.length) {
               if (65 <= arr[i] && arr[i] <= 67)
                    time += 3;
               else if (68 <= arr[i] && arr[i] <= 70)
                    time += 4;
               else if (71 <= arr[i] && arr[i] <= 73)
                    time += 5;
               else if (74 <= arr[i] && arr[i] <= 76)
                    time += 6;
               else if (77 <= arr[i] && arr[i] <= 79)
                    time += 7;
               else if (80 <= arr[i] && arr[i] <= 83)
                    time += 8;
               else if (84 <= arr[i] && arr[i] <= 86)
                    time += 9;
               else if (87 <= arr[i] && arr[i] <= 90)
                    time += 10;
               i++;
          }
          bw.write(time + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
