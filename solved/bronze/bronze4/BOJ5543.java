import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5543 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int burger1 = Integer.parseInt(br.readLine());
        int burger2 = Integer.parseInt(br.readLine());
        int burger3 = Integer.parseInt(br.readLine());
        int cola = Integer.parseInt(br.readLine());
        int cider = Integer.parseInt(br.readLine());

        int result = Math.min(burger1, Math.min(burger2, burger3)) + Math.min(cola, cider);

        bw.write(result - 50 + "\n");
        bw.flush();
        bw.close();
    }

}
