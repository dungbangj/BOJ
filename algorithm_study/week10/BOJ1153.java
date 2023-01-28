import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1153 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> usablePrimes = new ArrayList<>();
    static boolean[] eratos;
    static int MAX;

    public static void main(String[] args) throws IOException {
        MAX = Integer.parseInt(br.readLine());
        fillEratos();
        endWhenUnder8();
        fillUsablePrimes();
        printSortedPrimes();
    }

    private static void fillEratos() {
        eratos = new boolean[MAX + 1];

        for (int i = 2; i < Math.sqrt(MAX) + 1; i++) {
            if (eratos[i]) {
                continue;
            }
            for (int j = i; i * j < MAX + 1; j++) {
                eratos[i * j] = true;
            }
        }
    }

    private static void endWhenUnder8() {
        if (MAX < 8) {
            System.out.println("-1\n");
            System.exit(0);
        }
    }

    private static void fillUsablePrimes() {
        if (MAX % 2 == 1) {
            usablePrimes.add(2);
            usablePrimes.add(3);
            MAX -= 5;
        } else {
            usablePrimes.add(2);
            usablePrimes.add(2);
            MAX -= 4;
        }

        for (int i = 2; i <= MAX / 2; i++) {
            if (!eratos[i] && !eratos[MAX - i]) {
                usablePrimes.add(i);
                usablePrimes.add(MAX - i);
                break;
            }
        }
    }

    private static void printSortedPrimes() {
        for (Integer prime : usablePrimes) {
            System.out.print(prime + " ");
        }
    }
}
