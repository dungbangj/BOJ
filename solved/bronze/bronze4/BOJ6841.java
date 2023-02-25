import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ6841 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {
        Map<String, String> ShortForms = new HashMap<>();
        ShortForms.put("CU", "see you");
        ShortForms.put(":-)", "I’m happy");
        ShortForms.put(":-(", "I’m unhappy");
        ShortForms.put(";-)", "wink");
        ShortForms.put(":-P", "stick out my tongue");
        ShortForms.put("(~.~)", "sleepy");
        ShortForms.put("TA", "totally awesome");
        ShortForms.put("CCC", "Canadian Computing Competition");
        ShortForms.put("CUZ", "because");
        ShortForms.put("TY", "thank-you");
        ShortForms.put("YW", "you’re welcome");
        ShortForms.put("TTYL", "talk to you later");

        while (true) {
            String input = br.readLine();
            sb.append(ShortForms.getOrDefault(input, input)).append("\n");
            if (input.equals("TTYL")) {
                break;
            }
        }
        bw.write(sb.toString());
        clearBuffer();
    }

    private static void clearBuffer() throws IOException {
        br.close();
        bw.flush();
        bw.close();
    }

}
