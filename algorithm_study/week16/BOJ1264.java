import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1264 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        while (true) {
            char[] input = br.readLine().toCharArray();
            if (input[0] == '#') {
                break;
            }
            int count = 0;
            for (char c : input) {
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
                    || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
