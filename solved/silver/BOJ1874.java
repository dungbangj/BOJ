import java.io.*;
import java.util.*;

public class BOJ1874 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        int[] arr = new int[n];
        ArrayList<Character> ansArr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
            arr[i] = i + 1;
        }

        int arrIndex = 0;
        int inputIndex = 0;

        while (arrIndex < n) {

            stack.push(arr[arrIndex++]);
            ansArr.add('+');

            try {
                while (stack.peek() == input[inputIndex]) {
                    stack.pop();
                    inputIndex++;
                    ansArr.add('-');
                }
            } catch (Exception e) {
                continue;
            }
        }

        if (stack.size() != 0) {
            bw.write("NO\n");
        } else {
            for (Character character : ansArr) {
                bw.write(character + "\n");
            }
        }
        bw.flush();
        bw.close();

    }
}
