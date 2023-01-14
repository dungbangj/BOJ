import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16953 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 0;

        while (true) {
            if (A > B) {
                System.out.println(-1);
                return;
            } else if (A == B) {
                break;
            } else if (B % 2 == 0) {
                B /= 2;
            } else if (B % 10 == 1) {
                B -= 1;
                B /= 10;
            } else {
                System.out.println(-1);
                return;
            }
            count++;
        }
        System.out.println(count + 1);
    }

}
