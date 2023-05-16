import java.io.*;
import java.util.*;

public class BOJ10773 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (stack.isEmpty()) {
                    continue;
                }
                stack.pop();
            } else {
                stack.push(input);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
