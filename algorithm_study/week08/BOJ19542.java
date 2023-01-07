import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ19542 {

    static int D;
    static int distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int x, y;

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(S, 0, graph);
        if (distance != 0) {
            System.out.println(2 * (distance - 1));
        } else {
            System.out.println(0);
        }

    }

    static int dfs(int curNode, int preNode, ArrayList<ArrayList<Integer>> graph) {
        int maxD = 0;
        for (Integer node : graph.get(curNode)) {
            if (node != preNode) {
                maxD = Math.max(maxD, dfs(node, curNode, graph));
            }
        }
        if (maxD >= D) {
            distance++;
        }
//        System.out.println("curNode = " + curNode + ", maxD = " + maxD + ", distance = " + distance);
        return maxD + 1;
    }
}
