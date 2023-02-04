import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ6588 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> inputs = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static boolean[] eratos;
    static int max;

    public static void main(String[] args) throws IOException {
        fillInputs();
        fillEratos();
        findGoldBach();
        System.out.println(sb);
    }

    private static void fillInputs() throws IOException {
        max = 0;
        while (true) {
            int input = Integer.parseInt(br.readLine());
            max = Math.max(max, input);
            if (input == 0)
                break;
            inputs.add(input);
        }
    }

    private static void fillEratos() {
        eratos = new boolean[max + 1];
        for (int i = 3; i < Math.sqrt(max) + 1; i++) {
            for (int j = i; i * j < max + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static void findGoldBach() {
        int flag;
        for (Integer input : inputs) {
            flag = 0;
            for (int i = 3; i < input + 1; i++) {
                if (isGoldBach(input, i)) {
                    flag = 1;
                    sb.append(input).append(" = ").append(i).append(" + ").append(input - i).append("\n");
                    break;
                }
            }
            if (flag == 0) {
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }
        }
    }

    private static boolean isGoldBach(Integer input, int i) {
        return !eratos[i] && !eratos[input - i] && i % 2 == 1;
    }
}
