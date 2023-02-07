import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10166 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int D1, D2;
    static final int CIRCLE_DEGREE = 360;
    static boolean[] theatreCircle = new boolean[CIRCLE_DEGREE + 1];
    static ArrayList<Integer> primesOf360 = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        D1 = Integer.parseInt(st.nextToken());
        D2 = Integer.parseInt(st.nextToken());

        for (int i = D1; i <= Math.min(D2, CIRCLE_DEGREE); i++) {
            if (CIRCLE_DEGREE % i == 0) {
                primesOf360.add(i);
            }
        }
        System.out.println(primesOf360);
        int count = 0;
        for (Integer onePrime : primesOf360) {
            int div = CIRCLE_DEGREE / onePrime;
            int nums = 1;
            System.out.println("onePrime = " + onePrime);
            while (div * nums <= CIRCLE_DEGREE) {
                if (!theatreCircle[div * nums]) {
//                    System.out.println("nums = " + nums + ", div = " + div + ", mul = " + div * nums);
                    count++;
                }
                theatreCircle[div * nums] = true;
                nums++;
            }
        }

        System.out.println(count);
    }

}
