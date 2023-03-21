import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ6825 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        float weight = Float.parseFloat(br.readLine());
        float height = Float.parseFloat(br.readLine());
        float BMI = weight / (height * height);
        if (BMI < 18.5) {
            sb.append("Underweight");
        } else if (18.5 <= BMI && BMI <= 25.0) {
            sb.append("Normal weight");
        } else {
            sb.append("Overweight");
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
