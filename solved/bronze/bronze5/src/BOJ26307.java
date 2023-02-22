import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ26307 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        st = new StringTokenizer(br.readLine());
        int HH = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());
        int h = HH - 9;
        bw.write(h * 60 + MM + "\n");
        bw.flush();
        bw.close();
    }

}
