import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ2752 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            inputs.add(Integer.parseInt(st.nextToken()));
        }
        inputs.sort(Comparator.naturalOrder());
        for (int i = 0; i < 3; i++) {
            sb.append(inputs.get(i)).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
