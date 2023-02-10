import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ3671 {

    static final int MAX = 9_999_999;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static boolean[] eratos = new boolean[MAX + 1];
    static Set<Integer> makablePrimes = new HashSet<>();
    static String input;

    public static void main(String[] args) throws IOException {

        fillEratos();

        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            input = br.readLine();
            makablePrimes.clear();
            visited = new boolean[7];
            bondCards("");
            sb.append(makablePrimes.size()).append("\n");
        }
        System.out.println(sb);
    }

    private static void fillEratos() {
        eratos[0] = eratos[1] = true;
        for (int i = 2; i < Math.sqrt(MAX) + 1; i++) {
            for (int j = i; i * j < MAX + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static void bondCards(String card) {
        for (int i = 0; i < input.length(); i++) {
            if (!visited[i]) {
                String tmpBonding = card + input.charAt(i);
                int tmpBondingNum = Integer.parseInt(tmpBonding);
                if (!eratos[tmpBondingNum]) {
                    makablePrimes.add(tmpBondingNum);
                }
                visited[i] = true;
                bondCards(tmpBonding);
                visited[i] = false;
            }
        }
    }
}