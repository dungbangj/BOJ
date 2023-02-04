import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ9613 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int t, n;
    static ArrayList<ArrayList<Integer>> inputs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        fillInputs();
        getAllSums();
        System.out.println(sb);
    }

    private static void fillInputs() throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            ArrayList<Integer> oneLine = fillOneLine(new ArrayList<>());
            inputs.add(oneLine);
        }
    }

    private static ArrayList<Integer> fillOneLine(ArrayList<Integer> oneLine) {
        while (st.hasMoreTokens())
            oneLine.add(Integer.parseInt(st.nextToken()));
        oneLine.sort(Comparator.reverseOrder());
        return oneLine;
    }

    private static void getAllSums() {
        for (int i = 0; i < t; i++) {
            long sum = 0;
            ArrayList<Integer> tmpOneLine = inputs.get(i);
            for (int j = 0; j < tmpOneLine.size(); j++)
                sum = sumGCDs(sum, tmpOneLine, j);
            sb.append(sum).append("\n");
        }
    }

    private static long sumGCDs(long sum, ArrayList<Integer> tmpOneLine, int j) {
        for (int k = j + 1; k < tmpOneLine.size(); k++)
            sum += gcd(tmpOneLine.get(j), tmpOneLine.get(k));
        return sum;
    }

    private static long gcd(int A, int B) {
        int remain;

        while (B != 0) {
            remain = A % B;
            A = B;
            B = remain;
        }
        return A;
    }
}
