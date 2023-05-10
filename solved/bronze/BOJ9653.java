import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ9653 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        sb.append("    8888888888  888    88888").append("\n");
        sb.append("   88     88   88 88   88  88").append("\n");
        sb.append("    8888  88  88   88  88888").append("\n");
        sb.append("       88 88 888888888 88   88").append("\n");
        sb.append("88888888  88 88     88 88    888888").append("\n\n");
        sb.append("88  88  88   888    88888    888888").append("\n");
        sb.append("88  88  88  88 88   88  88  88").append("\n");
        sb.append("88 8888 88 88   88  88888    8888").append("\n");
        sb.append(" 888  888 888888888 88  88      88").append("\n");
        sb.append("  88  88  88     88 88   88888888").append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
