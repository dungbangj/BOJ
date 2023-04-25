import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ19941 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] HP = br.readLine().toCharArray();
        int count = 0;

        for (int i = 0; i < HP.length; i++) {

            if (HP[i] == 'H' || HP[i] == '0') {
                continue;
            }

            for (int j = i - K; j <= i + K; j++) {
                if (j < 0 || HP.length - 1 < j) {
                    continue;
                }
                if (HP[j] == 'H') {
                    HP[j] = '0';
                    count++;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(HP));
        System.out.println(count);
    }
}
