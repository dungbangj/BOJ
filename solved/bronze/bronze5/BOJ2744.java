import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2744 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        char[] arr = br.readLine().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (65 <= arr[i] && arr[i] <= 90) {
                arr[i] += 32;
            } else {
                arr[i] -= 32;
            }
        }
        bw.write(arr);
        bw.flush();
        bw.close();
    }
}
