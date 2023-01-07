import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ22856 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Node>[] nodes;
    static StringTokenizer st;
    static ArrayList<Integer> orders;
    static int count;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        nodes = new ArrayList[N + 1];
        orders = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            nodes[num].add(new Node(left, right));
        }

        dfs(1, true);
        dfs(1, false);
    }

    static void dfs(int curNode, boolean countIfTrue) {
        for (Node node : nodes[curNode]) {
            if (node.left != -1) {
                dfs(node.left, countIfTrue);
                if (!countIfTrue)
                    count++;
            }
            if (countIfTrue) {
                orders.add(curNode);
            } else {
                if (orders.get(orders.size() - 1) == curNode) {
                    System.out.println(count);
                    return;
                }
                count++;
            }
            if (node.right != -1) {
                dfs(node.right, countIfTrue);
                if (!countIfTrue)
                    count++;
            }
        }
    }

    static class Node {

        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

}
