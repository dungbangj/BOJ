import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ24736 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            sum += Integer.parseInt(st.nextToken()) * 6;
            sum += Integer.parseInt(st.nextToken()) * 3;
            sum += Integer.parseInt(st.nextToken()) * 2;
            sum += Integer.parseInt(st.nextToken()) * 1;
            sum += Integer.parseInt(st.nextToken()) * 2;
            sb.append(sum).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
