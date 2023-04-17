import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ9654 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        sb.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n");
        sb.append("N2 Bomber      Heavy Fighter  Limited    21        \n");
        sb.append("J-Type 327     Light Combat   Unlimited  1         \n");
        sb.append("NX Cruiser     Medium Fighter Limited    18        \n");
        sb.append("N1 Starfighter Medium Fighter Unlimited  25        \n");
        sb.append("Royal Cruiser  Light Combat   Limited    4         \n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
