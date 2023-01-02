import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2078 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int left = 0, right = 0;

        while (A != 1 || B != 1) {
            if (A < B) {
                B -= A;
                right++;
            } else {
                A -= B;
                left++;
            }
        }
        System.out.println(left + " " + right);
    }
}
