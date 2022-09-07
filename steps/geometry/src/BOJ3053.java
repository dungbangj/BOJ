import java.io.*;

public class BOJ3053 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          double num = Double.parseDouble(br.readLine());
          bw.write(String.format("%.6f", num * num * Math.PI) + "\n");
          bw.write(String.format("%.6f", 2 * num * num) + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
