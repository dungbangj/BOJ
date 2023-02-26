import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ6887 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int tiles = Integer.parseInt(br.readLine());
        int result = (int) Math.sqrt(tiles);
        sb.append("The largest square has side length ").append(result).append(".");
        bw.write(sb.toString());
        clearBuffer();
    }

    private static void clearBuffer() throws IOException {
        br.close();
        bw.flush();
        bw.close();
    }
}
