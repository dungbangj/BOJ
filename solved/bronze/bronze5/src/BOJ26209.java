import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ26209 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        String result = "";
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
            if (Integer.parseInt(st.nextToken()) == 9) {
                result = "F";
            }
        }
        if (!result.equals("F")) {
            result = "S";
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}
