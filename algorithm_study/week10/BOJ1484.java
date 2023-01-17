import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1484 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> factors = new ArrayList<>();
    static ArrayList<Integer> curWeights = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        fillFactors();
        fillCurWeights();
        if (isNoPossibleCurWeights()) {
            System.out.println(-1);
            return;
        }
        printSortedCurWeights();
    }

    private static void fillFactors() throws IOException {
        int G = Integer.parseInt(br.readLine());
        for (int i = 1; i < (int) (Math.sqrt(G)) + 1; i++) {
            if (isPossibleFactor(G, i)) {
                factors.add(i);
                factors.add(G / i);
            }
        }
    }

    private static boolean isPossibleFactor(int G, int i) {
        return G % i == 0 && G / i != i;
    }

    private static void fillCurWeights() {
        for (int i = 0; i < factors.size(); i += 2) {
            int sum = factors.get(i) + factors.get(i + 1);
            if (isPossibleCurWeight(sum)) {
                int curWeight = sum / 2;
                curWeights.add(curWeight);
            }
        }
    }

    private static boolean isPossibleCurWeight(int sum) {
        return sum % 2 == 0;
    }

    private static boolean isNoPossibleCurWeights() {
        return curWeights.size() == 0;
    }

    private static void printSortedCurWeights() {
        Object[] sortedAns = curWeights.stream().sorted().toArray();
        for (Object sortedAn : sortedAns) {
            System.out.println(sortedAn);
        }
    }
}
