import java.io.*;

public class BOJ11654 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int a = br.readLine().charAt(0);
          bw.write(a + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
