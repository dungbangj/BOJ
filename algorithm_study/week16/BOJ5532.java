import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5532 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int vacation = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        int kor = Integer.parseInt(br.readLine());
        int mathPerDay = Integer.parseInt(br.readLine());
        int korPerDay = Integer.parseInt(br.readLine());

        while (math > 0 || kor > 0) {
            math -= mathPerDay;
            kor -= korPerDay;
            vacation--;
        }
        bw.write(vacation + "\n");
        bw.flush();
        bw.close();
    }

}
