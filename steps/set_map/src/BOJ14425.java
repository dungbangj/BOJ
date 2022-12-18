import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ14425 {
     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int N = Integer.parseInt(st.nextToken());
          int M = Integer.parseInt(st.nextToken());
          HashMap<String, Integer> map = new HashMap<>();
          int count = 0;

          for (int i = 0; i < N; i++)
               map.put(br.readLine(), 1);
          for (int i = 0; i < M; i++)
               if (map.get(br.readLine()) != null)
                    count++;

          bw.write(count + "\n");
          br.close();
          bw.flush();
          bw.close();
     }
}
