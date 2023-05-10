import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ6778 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());
        String result = "";
        if (antenna >= 3 && eyes <= 4)
            result += "TroyMartian\n";
        if (antenna <= 6 && eyes >= 2)
            result += "VladSaturnian\n";
        if (antenna <= 2 && eyes <= 3)
            result += "GraemeMercurian\n";
        if (result.equals("")) {
            bw.flush();
            bw.close();
            return;
        }
        bw.write(result);
        bw.flush();
        bw.close();
    }

}
