import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class BOJ6840 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        arr.sort(Comparator.naturalOrder());
        bw.write(arr.get(1) + "");
        bw.flush();
        bw.close();
    }

}
