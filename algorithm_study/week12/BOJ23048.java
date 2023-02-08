import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23048 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static boolean[] eratos;
    static int[] colors;
    static int N;

    public static void main(String[] args) throws IOException {
        fillEratoas();
        printColors();
    }

    private static void fillEratoas() throws IOException {
        N = Integer.parseInt(br.readLine());
        eratos = new boolean[N + 1];
        eratos[0] = eratos[1] = true;
        for (int i = 2; i < Math.sqrt(N) + 1; i++) {
            for (int j = i; i * j < N + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static int fillColors() {
        colors = new int[N + 1];
        colors[1] = 1;
        int colorCount = 2;
        for (int i = 2; i < N + 1; i++) {
            for (int j = i; j < N + 1; j += i) {
                if (isPrimeAndNotColored(i, j))
                    colors[j] = colorCount;
            }
            if (colors[i] < colorCount)
                continue;
            colorCount++;
        }
        return colorCount;
    }

    private static boolean isPrimeAndNotColored(int i, int j) {
        return !eratos[i] && colors[j] == 0;
    }

    private static void printColors() {
        sb.append(fillColors() - 1).append("\n");
        for (int i = 1; i < N + 1; i++) {
            sb.append(colors[i]).append(" ");
        }
        System.out.println(sb);
    }
}
