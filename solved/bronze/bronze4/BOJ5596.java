import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5596 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int tmp = 0;
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            tmp = Math.max(tmp, sum);
        }
        bw.write(tmp + "\n");
        bw.flush();
        bw.close();
    }

}
