import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ6763 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        int limitSpeed = Integer.parseInt(br.readLine());
        int mySpeed = Integer.parseInt(br.readLine());
        int result = limitSpeed - mySpeed;
        int fine = 0;

        if (-1 >= result && result >= -20) {
            fine = 100;
        } else if (-21 >= result && result >= -30) {
            fine = 270;
        } else if (-31 >= result) {
            fine = 500;
        }

        if (result < 0) {
            sb.append("You are speeding and your fine is $").append(fine).append(".\n");
        } else {
            sb.append("Congratulations, you are within the speed limit!").append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
