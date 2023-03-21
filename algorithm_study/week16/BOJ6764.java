import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ6764 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int depth1 = Integer.parseInt(br.readLine());
        int depth2 = Integer.parseInt(br.readLine());
        int depth3 = Integer.parseInt(br.readLine());
        int depth4 = Integer.parseInt(br.readLine());

        int diff1 = depth2 - depth1;
        int diff2 = depth3 - depth2;
        int diff3 = depth4 - depth3;

        if (diff1 < 0 && diff2 < 0 && diff3 < 0) {
            bw.write("Fish Diving");
        } else if (diff1 > 0 && diff2 > 0 && diff3 > 0) {
            bw.write("Fish Rising");
        } else if (diff1 == 0 && diff2 == 0 && diff3 == 0) {
            bw.write("Fish At Constant Depth");
        } else {
            bw.write("No Fish");
        }
        bw.flush();
        bw.close();
    }

}
