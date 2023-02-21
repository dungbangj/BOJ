import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10170 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        sb.append("NFC West       W   L  T\n"
            + "-----------------------\n"
            + "Seattle        13  3  0\n"
            + "San Francisco  12  4  0\n"
            + "Arizona        10  6  0\n"
            + "St. Louis      7   9  0\n"
            + "\n"
            + "NFC North      W   L  T\n"
            + "-----------------------\n"
            + "Green Bay      8   7  1\n"
            + "Chicago        8   8  0\n"
            + "Detroit        7   9  0\n"
            + "Minnesota      5  10  1");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
