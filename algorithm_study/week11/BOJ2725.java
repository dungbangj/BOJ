import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2725 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int LINE = 1;
    static int[][] drawer;
    static int[] inputs;
    static int C, max;

    public static void main(String[] args) throws IOException {
        fillInputs();
        fillDrawer();
        countLines();
    }

    private static void fillInputs() throws IOException {
        C = Integer.parseInt(br.readLine());
        inputs = new int[C];
        for (int i = 0; i < C; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, inputs[i]);
        }
    }

    private static void fillDrawer() {
        drawer = new int[max + 1][max + 1];
        drawer[0][1] = drawer[1][0] = drawer[1][1] = 1;
        for (int i = 2; i < max + 1; i++) {
            for (int j = 1; j <= i - 1; j++) {
                if (canDrawLine(i, j))
                    drawer[i][j] = LINE;
            }
        }
    }

    private static boolean canDrawLine(int i, int j) {
        return gcd(i, j) == 1;
    }

    private static int gcd(int i, int j) {
        int remain;
        while (j != 0) {
            remain = i % j;
            i = j;
            j = remain;
        }
        return i;
    }

    private static void countLines() {
        int count;
        for (int input : inputs) {
            count = 0;
            for (int i = 2; i <= input; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    if (thereIsLine(i, j))
                        count++;
                }
            }
            System.out.println(3 + 2 * count);
        }
    }

    private static boolean thereIsLine(int i, int j) {
        return drawer[i][j] == LINE;
    }
}
