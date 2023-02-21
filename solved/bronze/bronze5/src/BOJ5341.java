import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5341 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        String input;
        while (true) {
            input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            int num = Integer.parseInt(input);
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            sb.append(sum).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
