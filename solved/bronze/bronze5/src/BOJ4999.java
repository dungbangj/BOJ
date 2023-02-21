import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ4999 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        String patient = br.readLine();
        String doctor = br.readLine();

        if (patient.length() >= doctor.length()) {
            sb.append("go");
        } else {
            sb.append("no");
        }
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
