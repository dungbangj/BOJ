import java.io.*;
import java.util.*;

public class BOJ2493 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Stack<Tower> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int newNum = Integer.parseInt(st.nextToken());
            Tower tower = new Tower(newNum, i + 1);

            while (!stack.isEmpty()) {
                if (tower.heightGetter() > stack.peek().heightGetter()) {
                    stack.pop();
                } else {
                    bw.write(stack.peek().idxGetter() + " ");
                    break;
                }
            }
            if (stack.isEmpty()) {
                bw.write("0 ");
            }
            stack.push(tower);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

class Tower {

    private final int height;
    private final int idx;

    Tower(int height, int idx) {
        this.height = height;
        this.idx = idx;
    }

    public int heightGetter() {
        return height;
    }

    public int idxGetter() {
        return idx;
    }
}